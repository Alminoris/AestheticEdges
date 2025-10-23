package net.alminoris.aestheticedges.block.custom;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.ModTags;
import net.alminoris.aestheticedges.util.helper.BlockShape;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class CurtainRodBlock extends YAxisRotatedBlock
{
    public enum Color implements StringIdentifiable
    {
        BLACK("black"),
        BROWN("brown"),
        GRAY("gray"),
        LIGHT_GRAY("light_gray"),
        WHITE("white"),
        RED("red"),
        ORANGE("orange"),
        YELLOW("yellow"),
        PURPLE("purple"),
        MAGENTA("magenta"),
        PINK("pink"),
        BLUE("blue"),
        CYAN("cyan"),
        LIGHT_BLUE("light_blue"),
        GREEN("green"),
        LIME("lime");

        private final String name;

        Color(String name) { this.name = name; }

        public static Color fromString(String name)
        {
            for (Color inside : Color.values())
            {
                if (inside.name.equalsIgnoreCase(name))
                    return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String asString() { return this.name; }
    }

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        LEFT("left"),
        RIGHT("right"),
        CENTER("center");

        private final String name;

        Variant(String name) { this.name = name; }

        public static Variant fromString(String name)
        {
            for (Variant inside : Variant.values())
            {
                if (inside.name.equalsIgnoreCase(name))
                    return inside;
            }
            throw new IllegalArgumentException("No enum constant for name: " + name);
        }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<Color> COLOR = EnumProperty.of("color", Color.class);

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    public static final BooleanProperty DRESSED = BooleanProperty.of("dressed");

    public static final BooleanProperty OPENED = BooleanProperty.of("opened");

    public CurtainRodBlock(Settings settings, BlockShape... shapes)
    {
        super(settings, shapes);
        this.setDefaultState(this.stateManager.getDefaultState().with(VARIANT, Variant.NORMAL).with(DRESSED, false)
                .with(COLOR, Color.BLACK).with(OPENED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        super.appendProperties(builder);
        builder.add(VARIANT, DRESSED, COLOR, OPENED);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getStackInHand(hand);

        boolean currentDressed = state.get(DRESSED);
        boolean currentOpened = state.get(OPENED);
        Variant currentVariant = state.get(VARIANT);

        if (stack.isIn(ModTags.Items.CURTAINS) && !currentDressed)
        {
            if (!world.isClient)
            {
                Direction currentFacing = state.get(FACING);
                String colorName = Registry.ITEM.getId(stack.getItem()).getPath().replace("curtain_", "");
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(VARIANT, currentVariant)
                        .with(DRESSED, true)
                        .with(OPENED, currentOpened)
                        .with(COLOR, Color.fromString(colorName)));

                stack.decrement(1);
            }

            return ActionResult.SUCCESS;
        }

        if (stack.isEmpty() && currentDressed)
        {
            if (!world.isClient)
            {
                Direction currentFacing = state.get(FACING);
                Color currentColor = state.get(COLOR);
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(VARIANT, currentVariant)
                        .with(DRESSED, currentDressed)
                        .with(OPENED, !currentOpened)
                        .with(COLOR, currentColor));

                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);
            }

            return ActionResult.SUCCESS;
        }

        if (stack.isOf(ModItems.CURTAIN_REMOVER))
        {
            if (!world.isClient)
            {
                Direction currentFacing = state.get(FACING);
                Color currentColor = state.get(COLOR);
                String colorName = currentColor.asString();
                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(VARIANT, currentVariant)
                        .with(DRESSED, false)
                        .with(OPENED, currentOpened)
                        .with(COLOR, currentColor));

                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);

                Item item = Registry.ITEM.get(Identifier.of(AestheticEdges.MOD_ID, "curtain_"+colorName));
                ItemStack carpetStack = new ItemStack(item);
                if (!player.getInventory().insertStack(carpetStack))
                    player.dropItem(carpetStack, false);
            }

            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        return updateCurtainRodVariant(state, world, pos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingCurtainRodes(world, pos);
    }

    private void updateSurroundingCurtainRodes(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() == this)
                world.setBlockState(neighborPos, updateCurtainRodVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateCurtainRodVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isCurtainRod(world, leftPos, facing);
        boolean rightConnected = isCurtainRod(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.with(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.with(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.with(VARIANT, Variant.LEFT);
        else
            return state.with(VARIANT, Variant.NORMAL);
    }

    private boolean isCurtainRod(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() == this && state.get(FACING) == facing;
    }
}