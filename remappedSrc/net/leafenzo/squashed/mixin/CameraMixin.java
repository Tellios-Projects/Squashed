package net.leafenzo.squashed.mixin;

import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Camera.class)
public abstract class CameraMixin {
    /*
    @Inject(method = "getSubmersionType", ordinal = "CameraSubmersionType.POWDER_SNOW", at = @At("FIELD"))
    protected void injectDenseCobwebCheck(CallbackInfoReturnable info) {
        if (!blockState.isOf(ModBlocks.DENSE_COBWEB_BLOCK)) continue;
        return CameraSubmersionType.POWDER_SNOW;
    }
    */
}
