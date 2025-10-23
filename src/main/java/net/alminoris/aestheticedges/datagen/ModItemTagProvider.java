package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.ModTags;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;


public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    protected void generateTags()
    {
        for (String name : BlockSetsHelper.COLORS)
        {
            this.getOrCreateTagBuilder(ModTags.Items.CURTAINS).add(ModItems.CURTAINS.get(name));
        }
    }
}