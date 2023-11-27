/*
    SOURCES:
    LaidBackSloth - https://github.com/LaidBackSloth/AngelBlockRenewed/blob/forge-1.20-1.20.1/src/main/java/com/laidbacksloth/angelblockrenewed/AngelBlockItem.java
 */

package net.leafenzo.squashed.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class PhantomBlockItem extends BlockItem {
    public PhantomBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        double x = user.getX() + user.getRotationVector().x * 4.5;
        double y = user.getEyeY() + user.getRotationVector().y * 4.5;
        double z = user.getZ() + user.getRotationVector().z * 4.5;
        BlockPos pos = new BlockPos((int) Math.floor(x), (int) Math.floor(y), (int) Math.floor(z));

        if(world.isInBuildLimit(pos) && world.getWorldBorder().contains(pos) && world.getBlockState(pos).isReplaceable()) {
            ItemPlacementContext context = new ItemPlacementContext(world, user, hand, itemStack, new BlockHitResult(pos.toCenterPos(), Direction.NORTH, pos, false)); // I have no idea what insideBlock is supposed to mean...
            ActionResult actionResult = useOnBlock(context);
            if  (actionResult.isAccepted()) {
                return TypedActionResult.success(itemStack, !world.isClient());
            }
        }
        return super.use(world, user, hand);
    }
}