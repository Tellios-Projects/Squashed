package net.leafenzo.squashed.block;

import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ExperienceBlock extends ExperienceDroppingBlock {
    public ExperienceBlock(Settings settings) {
        super(settings, UniformIntProvider.create(12, 44));
    }
}
