package net.leafenzo.squashed.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NoisyFallingBlock extends FallingBlock {
    public SoundEvent fallingSoundEvent;
    public float fallingSoundVolume;
    public float fallingSoundPitch;

    public NoisyFallingBlock(Settings settings, SoundEvent fallingSoundEvent, float fallingSoundVolume, float fallingSoundPitch) {
        super(settings);
        this.fallingSoundEvent = fallingSoundEvent;
        this.fallingSoundVolume = fallingSoundVolume;
        this.fallingSoundPitch = fallingSoundPitch;
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (!fallingBlockEntity.isSilent()) {
            world.playSound(null, pos, fallingSoundEvent, SoundCategory.BLOCKS, 1.4f, 1.0f);
        }
    }
}
