package net.alminoris.aestheticedges;

import net.alminoris.aestheticedges.datagen.ModBlockTagProvider;
import net.alminoris.aestheticedges.datagen.ModLootTableProvider;
import net.alminoris.aestheticedges.datagen.ModModelProvider;
import net.alminoris.aestheticedges.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticEdgesDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
	}
}