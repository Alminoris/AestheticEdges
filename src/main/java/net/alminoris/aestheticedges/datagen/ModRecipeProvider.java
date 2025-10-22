package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.alminoris.aestheticedges.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        for(String name : BlockSetsHelper.COLORS)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name+"_wool"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CURTAINS.get(name))
                    .pattern("#")
                    .pattern("#")
                    .input('#', block)
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURTAIN_RODS.get(name), block, 2);

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURBSTONES.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURBSTONES_OUTER.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURBSTONES_INNER.get(name), block, 2);

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HIGH_CURBSTONES.get(name), block, 2);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HIGH_CURBSTONES_OUTER.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HIGH_CURBSTONES_INNER.get(name), block, 1);

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_CURBS.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_CURBS_OUTER.get(name), block, 8);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIMPLE_CURBS_INNER.get(name), block, 2);
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURBSTONES.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURBSTONES_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.CURBSTONES_INNER.get(name)).getPath(), "2");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.HIGH_CURBSTONES.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.HIGH_CURBSTONES_OUTER.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.HIGH_CURBSTONES_INNER.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.SIMPLE_CURBS.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.SIMPLE_CURBS_OUTER.get(name)).getPath(), "8");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.SIMPLE_CURBS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"));

            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block1 = Registries.BLOCK.get(Identifier.ofVanilla("stripped_"+name+"_"+logName));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CURTAIN_RODS.get(name), block1, 2);

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASEBOARDS.get(name), block, 3);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASEBOARDS_OUTER.get(name), block, 4);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASEBOARDS_INNER.get(name), block, 2);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:stripped_"+name+"_log",
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:stripped_"+name+"_log",
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:stripped_"+name+"_log",
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:stripped_"+name+"_log",
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:stripped_"+name+"_log",
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
        {
            String newName = name.replace("_nss", "");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:stripped_"+newName+"_log",
                    Registries.BLOCK.getId(ModBlocks.CURTAIN_RODS.get(name)).getPath(), "2");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS.get(name)).getPath(), "3");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_OUTER.get(name)).getPath(), "4");
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+newName+"_planks",
                    Registries.BLOCK.getId(ModBlocks.BASEBOARDS_INNER.get(name)).getPath(), "2");
        }
    }
}