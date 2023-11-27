/*
    SOURCES:
    creoii - https://github.com/jack-zisa/CreoLib/blob/1ad8c037c17349e9ba7a52c28deb95758e1d873f/src/main/java/com/github/creoii/creolib/mixin/world/dimension/NetherPortalMixin.java#L13
 */

package net.leafenzo.squashed.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.leafenzo.squashed.registry.tag.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.dimension.NetherPortal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(NetherPortal.class)
public class NetherPortalMixin {
    @WrapOperation(
            method = "method_30487(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Z", //<target method>
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/block/BlockState.isOf (Lnet/minecraft/block/Block;)Z" //<bytecode class name> + <;> + <bytecode target method name>
            )
    )
    private static boolean isOf(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.isIn(ModTags.Blocks.NETHER_PORTAL_FRAME);
    }


//    @Shadow @Final @Mutable
//    private static AbstractBlock.ContextPredicate IS_VALID_FRAME_BLOCK;
//
//    static {
//        IS_VALID_FRAME_BLOCK = (state, world, pos) -> {
//            return IS_VALID_FRAME_BLOCK.test(state, world, pos) || state.isIn(ModBlockTags.NETHER_PORTAL_FRAME);
////            return state.isIn(ModBlockTags.NETHER_PORTAL_FRAME) || state.isOf(Blocks.OBSIDIAN);
//        };
//    }

//    private AbstractBlock.ContextPredicate isOf(Target instance, boolean flag, Operation<AbstractBlock.ContextPredicate> original) {
//        return state.isOf(ModBlockTags.NETHER_PORTAL_FRAME) || original.call(state, block);
//    }


//    public boolean IsValidFrame(BlockState state, BlockView world, BlockPos pos) {
//        return state.isIn(ModBlockTags.NETHER_PORTAL_FRAME);
//    }
}
