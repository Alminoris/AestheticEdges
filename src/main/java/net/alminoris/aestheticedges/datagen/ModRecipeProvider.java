package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.item.ModItemGroups;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(ModItems.CURTAIN_REMOVER)
                .pattern("# #")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);

        for(String name : BlockSetsHelper.COLORS)
        {
            Block block = Registry.BLOCK.get(Identifier.of("minecraft", name+"_wool"));

            ShapedRecipeJsonBuilder.create(ModItems.CURTAINS.get(name))
                    .pattern("#")
                    .pattern("#")
                    .input('#', block)
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registry.BLOCK.get(Identifier.of("minecraft", name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            offerStonecuttingRecipe(recipeExporter, ModBlocks.CURTAIN_RODS.get(name), block, 2);

            offerStonecuttingRecipe(recipeExporter, ModBlocks.CURBSTONES.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.CURBSTONES_OUTER.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.CURBSTONES_INNER.get(name), block, 2);

            offerStonecuttingRecipe(recipeExporter, ModBlocks.HIGH_CURBSTONES.get(name), block, 2);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.HIGH_CURBSTONES_INNER.get(name), block, 1);

            offerStonecuttingRecipe(recipeExporter, ModBlocks.SIMPLE_CURBS.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.SIMPLE_CURBS_OUTER.get(name), block, 8);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.SIMPLE_CURBS_INNER.get(name), block, 2);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.CURBSTONES.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.CURBSTONES_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.CURBSTONES_INNER.get(name)).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.HIGH_CURBSTONES.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.HIGH_CURBSTONES_OUTER.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.HIGH_CURBSTONES_INNER.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.SIMPLE_CURBS.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.SIMPLE_CURBS_OUTER.get(name)).getPath(), "8");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.SIMPLE_CURBS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registry.BLOCK.get(Identifier.of("minecraft", name+"_planks"));

            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block1 = Registry.BLOCK.get(Identifier.of("minecraft", "stripped_"+name+"_"+logName));

            offerStonecuttingRecipe(recipeExporter, ModBlocks.CURTAIN_RODS.get(name), block1, 2);

            offerStonecuttingRecipe(recipeExporter, ModBlocks.BASEBOARDS.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.BASEBOARDS_OUTER.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.BASEBOARDS_INNER.get(name), block, 2);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:stripped_"+name+"_log",
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:stripped_"+name+"_log",
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:stripped_"+name+"_log",
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:stripped_"+name+"_log",
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:stripped_"+name+"_log",
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            String newName = name.replace("_nss", "");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:stripped_"+newName+"_log",
                    Registry.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    Registry.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }
    }
}