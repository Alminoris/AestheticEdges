package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.item.ModItems;
import net.alminoris.aestheticedges.util.ModTags;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        for (String name : BlockSetsHelper.COLORS)
        {
            this.getOrCreateTagBuilder(ModTags.Items.CURTAINS).add(ModItems.CURTAINS.get(name));
        }
    }
}