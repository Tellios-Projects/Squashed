package net.leafenzo.squashed.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class ModBlockTags {
    public static final TagKey<Block> ANY_MINABLE = ModBlockTags.of("any_minable");
    public static final TagKey<Block> CAT_PLAYS_WITH = ModBlockTags.of("cat_plays_with"); //TODO make use of me! (currently unsused) (LOW PRIORITY)
    public static final TagKey<Block> NETHER_PORTAL_FRAME = ModBlockTags.of("nether_portal_frame");
    public static final TagKey<Block> CONDUIT_FRAME = ModBlockTags.of("conduit_frame");

    private ModBlockTags() {
    }
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
