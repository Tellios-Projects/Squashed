package net.leafenzo.squashed.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class ModBlockTags {
    public static final TagKey<Block> ANY_MINABLE = ModBlockTags.of("any_minable");
    public static final TagKey<Block> CAT_PLAYS_WITH = ModBlockTags.of("cat_plays_with"); //TODO make use of me! (currently unsused) (LOW PRIORITY)

    private ModBlockTags() {
    }
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
