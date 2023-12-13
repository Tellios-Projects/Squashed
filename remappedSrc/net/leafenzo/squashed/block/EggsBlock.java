package net.leafenzo.squashed.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EggsBlock extends FallingBlock {
    public EggsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (!fallingBlockEntity.isSilent()) {
            world.playSound(null, pos, SoundEvents.BLOCK_SUSPICIOUS_SAND_BREAK, SoundCategory.BLOCKS, 1.5f, 1.5f);
            world.playSound(null, pos, SoundEvents.BLOCK_SUSPICIOUS_SAND_BREAK, SoundCategory.BLOCKS, 1.4f, 1.2f);
            world.playSound(null, pos, SoundEvents.BLOCK_SUSPICIOUS_SAND_BREAK, SoundCategory.BLOCKS, 1.3f, 0.8f);
        }

        int chickenTries = 9;
        for (int i = 0; i < chickenTries; i++) {
            EggEntity chickenSpawn = new EggEntity(world, pos.getX() + 0.5f, pos.getY(), pos.getZ() + 0.5f);
            world.spawnEntity(chickenSpawn);
        }

        world.removeBlock(pos, false);
    }
}
