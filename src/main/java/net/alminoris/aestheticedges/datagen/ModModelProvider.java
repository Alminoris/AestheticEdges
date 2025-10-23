package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.item.ModItemGroups;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static net.alminoris.aestheticedges.util.helper.BlockSetsHelper.COLORS;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.STONES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, name, "minecraft");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_MODEL_TEMPLATE, ModBlocks.CURBSTONES.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_INNER.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_OUTER.get(name), name, "minecraft");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_INNER.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), name, "minecraft");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_INNER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_INNER.get(name), name, "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_OUTER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_OUTER.get(name), name, "minecraft");
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, name, "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_MODEL_TEMPLATE, ModBlocks.CURBSTONES.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_INNER.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.CURBSTONES_OUTER.get(name), name, "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_INNER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_INNER.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), name, "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_INNER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_INNER.get(name), name, "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.SIMPLE_CURB_OUTER_MODEL_TEMPLATE, ModBlocks.SIMPLE_CURBS_OUTER.get(name), name, "aestheticedges");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_"+logName, "minecraft");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "minecraft");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "minecraft");
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            registerCurtainRod(blockStateModelGenerator, ModBlocks.CURTAIN_RODS.get(name), name, "stripped_"+name+"_log", "aestheticedges");

            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_MODEL_TEMPLATE, ModBlocks.BASEBOARDS.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_INNER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_INNER.get(name), name+"_planks", "aestheticedges");
            registerEdge(blockStateModelGenerator, ModJsonTemplates.BASEBOARD_OUTER_MODEL_TEMPLATE, ModBlocks.BASEBOARDS_OUTER.get(name), name+"_planks", "aestheticedges");
        }
    }

    public final void registerCurtainRod(BlockStateModelGenerator blockStateModelGenerator, Block curtainRod, String matName ,String name, String modId)
    {
        for (String colorName : COLORS)
        {
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "normal", false, false);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "left", false, false);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "right", false, false);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "center", false, false);

            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "normal", true, false);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "left", true, false);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "right", true, false);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "center", true, false);

            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "normal", true, true);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "left", true, true);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "right", true, true);
            ModJsonHelper.createCurtainRodBlockModel(Registry.BLOCK.getId(curtainRod).getPath(),modId+":block/"+name,
                    colorName, "center", true, true);
        }

        String filePath = System.getProperty("user.dir").replace("build\\datagen",
                "src\\main\\resources") + "/assets/"+ AestheticEdges.MOD_ID+"/blockstates/curtain_rod_template.json";
        String s = "";
        try { s = Files.readString(Paths.get(filePath)); } catch (IOException ignored) {}

        ModJsonHelper.createBlockstate(Registry.BLOCK.getId(curtainRod).getPath(), matName, s);
        blockStateModelGenerator.registerParentedItemModel(curtainRod, Identifier.of(AestheticEdges.MOD_ID, "block/"+Registry.BLOCK.getId(curtainRod).getPath()));
    }

    public final void registerEdge(BlockStateModelGenerator blockStateModelGenerator, String jsonContext, Block curbstone, String name, String modId)
    {
        ModJsonHelper.createBlockModel(jsonContext, Registry.BLOCK.getId(curbstone).getPath(),modId+":block/"+name);
        ModJsonHelper.createBlockstate(Registry.BLOCK.getId(curbstone).getPath(), Registry.BLOCK.getId(curbstone).getPath(), ModJsonTemplates.YAXIS_ROTATED_BLOCKSTATE_TEMPLATE);
        blockStateModelGenerator.registerParentedItemModel(curbstone, Identifier.of(AestheticEdges.MOD_ID, "block/"+Registry.BLOCK.getId(curbstone).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        for (String name : COLORS)
        {
            itemModelGenerator.register(ModItems.CURTAINS.get(name), Models.GENERATED);
        }
        itemModelGenerator.register(ModItems.CURTAIN_REMOVER, Models.GENERATED);
    }
}