package net.alminoris.aestheticedges.datagen;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static net.fabricmc.loader.impl.util.StringUtil.capitalize;

public class ModLanguageProviderEnUs extends FabricLanguageProvider
{
    public ModLanguageProviderEnUs(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Registries.BLOCK.stream()
                .filter(block ->
                {
                    Identifier id = Registries.BLOCK.getId(block);
                    return AestheticEdges.MOD_ID.equals(id.getNamespace());
                })
                .forEach(block ->
                {
                    Identifier id = Registries.BLOCK.getId(block);
                    String path = id.getPath();

                    String pathNew = path;

                    pathNew = movePrefix(movePrefix(path, BlockSetsHelper.getStones()), BlockSetsHelper.getWoods());

                    String[] parts = pathNew.split("_");

                    String displayName = Arrays.stream(parts)
                            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                            .collect(Collectors.joining(" "));

                    displayName = displayName.replace(" Nss", "");

                    translationBuilder.add("block." + AestheticEdges.MOD_ID + "." + path, displayName);
                });

        Registries.ITEM.stream()
                .filter(item ->
                {
                    Identifier id = Registries.ITEM.getId(item);
                    return AestheticEdges.MOD_ID.equals(id.getNamespace());
                })
                .forEach(item ->
                {
                    Identifier id = Registries.ITEM.getId(item);
                    String path = id.getPath();

                    String pathNew = path;

                    pathNew = movePrefix(path, BlockSetsHelper.COLORS);

                    String[] parts = pathNew.split("_");

                    String displayName = Arrays.stream(parts)
                            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                            .collect(Collectors.joining(" "));

                    translationBuilder.add("item." + AestheticEdges.MOD_ID + "." + path, displayName);
                });

        translationBuilder.add("itemgroup.aedgstab","Aesthetic Edges");
    }

    public static String movePrefix(String input, String[] arr)
    {
        String[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted, (a, b) -> Integer.compare(b.length(), a.length()));

        for (String el : sorted)
        {
            String suffix = "_" + el;
            if (input.endsWith(suffix))
            {
                String base = input.substring(0, input.length() - suffix.length());

                return base.isEmpty() ? el : el + "_" + base;
            }
        }
        return input;
    }
}