package net.alminoris.aestheticedges.util;

import net.alminoris.aestheticedges.AestheticEdges;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.BLOCK;
import static net.minecraft.util.registry.Registry.ITEM;

public class ModTags
{
    public static class Blocks
    {
        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(BLOCK.getKey(), Identifier.of(AestheticEdges.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> CURTAINS = createTag("curtains");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(ITEM.getKey(), Identifier.of(AestheticEdges.MOD_ID, name));
        }
    }
}
