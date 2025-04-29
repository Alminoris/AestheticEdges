package net.alminoris.aestheticedges.item;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups
{
    public static List<String> EXTRA_WOODS_WF = new ArrayList<>();

    public static List<String> EXTRA_WOODS_AN = new ArrayList<>();

    public static List<String> EXTRA_STONES_WF = new ArrayList<>();

    public static final ItemGroup AEDGS_TAB = FabricItemGroupBuilder.build(new Identifier(AestheticEdges.MOD_ID, "aedgstab"),
            () -> new ItemStack(ModBlocks.CURBSTONES_INNER.get("stone")));

    public static void registerItemGroups()
    {
        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
        {
            EXTRA_WOODS_AN = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
                    "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper");
        }
        if (FabricLoader.getInstance().isModLoaded("wildfields"))
        {
            EXTRA_WOODS_WF = List.of("olive", "tamarisk");

            EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block");
        }
    }
}