package net.leafenzo.squashed.mixin.client;

import net.leafenzo.squashed.interfaces.IAmbientOcclusionDisableable;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Debug(export = true) //TODO remove me when done testing
@Mixin(AbstractBlock.AbstractBlockState.class)
public class AbstractBlockStateMixin implements IAmbientOcclusionDisableable {
    @Unique private boolean doAmbientOcclusion = true;

    @Inject(method = "getAmbientOcclusionLightLevel", at = @At(value = "RETURN"), cancellable = true)
    private void getAmbientOcclusionLightLevel(BlockView world, BlockPos pos, CallbackInfoReturnable<Float> cir) {
        if(!isAmbientOcclusionEnabled()) { cir.setReturnValue(0.0f); }  // This works I think, but it doesn't actually solve the sponge problem :c
    }

    @Override
    public Boolean isAmbientOcclusionEnabled() {
        return doAmbientOcclusion;
    }

    @Override
    public void setAmbientOcclusionEnabled(boolean bool) {
        doAmbientOcclusion = bool;
    }
}
