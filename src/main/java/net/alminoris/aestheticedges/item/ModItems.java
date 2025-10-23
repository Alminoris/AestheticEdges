package net.alminoris.aestheticedges.item;

import net.alminoris.aestheticedges.AestheticEdges;
import net.alminoris.aestheticedges.util.helper.BlockSetsHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModItems
{
    public static final Dictionary<String, Item> CURTAINS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.COLORS)
        {
            put(name, registerItem("curtain_"+name, new Item(new Item.Settings().maxCount(16))));
        }
    }};

    public static final Item CURTAIN_REMOVER = registerItem("curtain_remover", new ToolItem(ToolMaterials.STONE, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AestheticEdges.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}