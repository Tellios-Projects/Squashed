package net.leafenzo.squashed.mixin;

import net.leafenzo.squashed.block.GunpowderBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FireBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FireBlock.class)
public class FireBlockMixin {
    @Inject(method = "trySpreadingFire", at = @At(value = "TAIL"))
    private void trySpreadingFire(World world, BlockPos pos, int spreadFactor, Random random, int currentAge, CallbackInfo ci) {
        BlockState blockState = world.getBlockState(pos);
        Block block = blockState.getBlock();
        if (block instanceof GunpowderBlock) {
            ((GunpowderBlock) block).primeExplosion(world, pos, null);
        }
    }
}
