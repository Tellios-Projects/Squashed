package net.leafenzo.squashed.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class ModBlockTags {
    public static final TagKey<Block> ANY_MINABLE = ModBlockTags.of("any_minable");



    private ModBlockTags() {
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
