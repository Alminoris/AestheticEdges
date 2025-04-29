package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.block.ModBlocks;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.getStones())
        {
            addDrop(ModBlocks.CURBSTONES.get(name));
            addDrop(ModBlocks.CURBSTONES_INNER.get(name));
            addDrop(ModBlocks.CURBSTONES_OUTER.get(name));

            addDrop(ModBlocks.HIGH_CURBSTONES.get(name));
            addDrop(ModBlocks.HIGH_CURBSTONES_INNER.get(name));
            addDrop(ModBlocks.HIGH_CURBSTONES_OUTER.get(name));

            addDrop(ModBlocks.SIMPLE_CURBS.get(name));
            addDrop(ModBlocks.SIMPLE_CURBS_INNER.get(name));
            addDrop(ModBlocks.SIMPLE_CURBS_OUTER.get(name));
        }

        for(String name : BlockSetsHelper.getWoods())
        {
            addDrop(ModBlocks.BASEBOARDS.get(name));
            addDrop(ModBlocks.BASEBOARDS_INNER.get(name));
            addDrop(ModBlocks.BASEBOARDS_OUTER.get(name));
        }
    }
}