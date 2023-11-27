package net.leafenzo.squashed.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.leafenzo.squashed.registry.tag.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ConduitBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ConduitBlockEntity.class)
public class ConduitBlockEntityMixin {

    @WrapOperation(
            method = "updateActivatingBlocks(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;)Z", //<target method>
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/block/BlockState.isOf (Lnet/minecraft/block/Block;)Z" //<bytecode class name> + <;> + <bytecode target method name>
            )
    )
    private static boolean isOf(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.isIn(ModTags.Blocks.CONDUIT_FRAME);
    }


//    @Inject(method = "updateActivatingBlocks", at = @At(value = "RETURN"), cancellable = true)
//    private static void updateActivatingBlocks(World world, BlockPos pos, List<BlockPos> activatingBlocks, CallbackInfoReturnable<Boolean> cir) {
//
//    }



//    @WrapOperation(
//            method = "updateActivatingBlocks(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;)Z", //<target method>
//            at = @At(
//                    value = "INVOKE",
//                    opcode = Opcodes.GETFIELD,
//                    target = "net/minecraft/block/entity/ConduitBlockEntity.ACTIVATING_BLOCKS : [Lnet/minecraft/block/Block;" //<bytecode class name> + <;> + <bytecode target method name>
//            )
//    )
//    private Block[] addActivatingBlocks(Block[] original) {
//        return (Block[]) ModUtil.concat(original, ModUtil.allBlocksInTag(ModBlockTags.CONDUIT_FRAME).toArray());
//    }

    //    @ModifyExpressionValue(
//            method = "",
//            at = @At(value = "INVOKE",  opcode = Opcodes.GETFIELD, target = "[Lnet/minecraft/block/Block; ACTIVATING_BLOCKS")
//    )

//    private static boolean isOf(BlockState state, Block block, Operation<Boolean> original) {
//        return original.call(state, block) || state.isIn(ModBlockTags.NETHER_PORTAL_FRAME);
//    }
}
