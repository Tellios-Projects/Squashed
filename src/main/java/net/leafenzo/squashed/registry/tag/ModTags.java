package net.leafenzo.squashed.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ANY_MINABLE = getOrCreateModBlockTag("any_minable");
        public static final TagKey<Block> CAT_PLAYS_WITH = getOrCreateModBlockTag("cat_plays_with"); //TODO make use of me! (currently unsused) (LOW PRIORITY)
        public static final TagKey<Block> NETHER_PORTAL_FRAME = getOrCreateModBlockTag("nether_portal_frame");
        public static final TagKey<Block> CONDUIT_FRAME = getOrCreateModBlockTag("conduit_frame");

        public static TagKey<Block> getOrCreateModBlockTag(String id) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
        }
        private static TagKey<Block> getOrCreateCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }
    public static class Items {
        public static final TagKey<Item> GRASS = getOrCreateCommonTag("grass");

        public static TagKey<Item> getOrCreateModItemTag(String id) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(id));
        }
        private static TagKey<Item>  getOrCreateCommonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}
