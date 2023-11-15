package net.leafenzo.squashed.mixin;

import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BubbleColumnBlock.class)
public class BubbleColumnBlockMixin {
    @Final @Shadow public static final BooleanProperty DRAG = Properties.DRAG;

    @Inject(method = "canPlaceAt", at = @At(value = "RETURN"), cancellable = true)
    private void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState blockState = world.getBlockState(pos.down());
        if(blockState.isOf(ModBlocks.COMPACTED_SOUL_SAND[0]) || blockState.isOf(ModBlocks.COMPACTED_SOUL_SAND[1]) || blockState.isOf(ModBlocks.COMPACTED_SOUL_SAND[2]))  {
            cir.setReturnValue(true);
        }
    }

    //sadly it would take a while to program it so that entities are shot up at speeds depending what compactness of soul sand we use- we would need to make an interface with the new float property, and mixin to the entity class's onBubbleColumnCollision() as well. I know how to do this I should just ask el before putting the time in. //TODO ask el about this
    @Inject(method = "getBubbleState", at = @At(value = "RETURN"), cancellable = true)
    private static void getBubbleState(BlockState state, CallbackInfoReturnable<BlockState> cir) {
        if (state.isOf(ModBlocks.COMPACTED_SOUL_SAND[0]) || state.isOf(ModBlocks.COMPACTED_SOUL_SAND[1]) || state.isOf(ModBlocks.COMPACTED_SOUL_SAND[2])) {
            cir.setReturnValue((BlockState)Blocks.BUBBLE_COLUMN.getDefaultState().with(DRAG, false));
        }
    }
}
