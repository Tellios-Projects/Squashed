package net.leafenzo.squashed.mixin;


import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// @Debug(export = true)
@Mixin(PistonHandler.class)
public class PistonHandlerMixin {

    @Inject(method = "isBlockSticky", at = @At(value = "RETURN"), cancellable = true)
    private static void isBlockSticky(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if(state.isOf(ModBlocks.MAGMA_CREAM_BLOCK) || state.isOf(ModBlocks.COMPRESSED_HONEY_BLOCK) || state.isOf(ModBlocks.COMPRESSED_SLIME_BLOCK)) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "isAdjacentBlockStuck", at = @At(value = "RETURN"), cancellable = true)
    private static void isAdjacentBlockStuck(BlockState state, BlockState adjacentState, CallbackInfoReturnable<Boolean> cir) {
        if( (state.isOf(Blocks.HONEY_BLOCK) || state.isOf(ModBlocks.COMPRESSED_HONEY_BLOCK)) && adjacentState.isOf(ModBlocks.MAGMA_CREAM_BLOCK)) {
            cir.setReturnValue(false);
        }
        if(state.isOf(ModBlocks.MAGMA_CREAM_BLOCK) && (adjacentState.isOf(Blocks.HONEY_BLOCK) || state.isOf(ModBlocks.COMPRESSED_HONEY_BLOCK)) ) {
            cir.setReturnValue(false);
        }
        if( (state.isOf(Blocks.SLIME_BLOCK) || state.isOf(ModBlocks.COMPRESSED_SLIME_BLOCK)) && adjacentState.isOf(ModBlocks.MAGMA_CREAM_BLOCK)) {
            cir.setReturnValue(false);
        }
        if(state.isOf(ModBlocks.MAGMA_CREAM_BLOCK) && (adjacentState.isOf(Blocks.SLIME_BLOCK) || state.isOf(ModBlocks.COMPRESSED_SLIME_BLOCK))) {
            cir.setReturnValue(false);
        }

        if(state.isOf(ModBlocks.COMPRESSED_HONEY_BLOCK) && adjacentState.isOf(ModBlocks.COMPRESSED_SLIME_BLOCK)) {
            cir.setReturnValue(false);
        }
        if(state.isOf(ModBlocks.COMPRESSED_SLIME_BLOCK) && adjacentState.isOf(ModBlocks.COMPRESSED_HONEY_BLOCK)) {
            cir.setReturnValue(false);
        }
    }
}
