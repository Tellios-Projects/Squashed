/*
package net.leafenzo.squashed.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class PhantomBlockItem extends BlockItem {
    public PhantomBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    //@Nullable
    @NotNull
    @Override
    public ActionResult place(ItemPlacementContext context) {
        if (!this.getBlock().isEnabled(context.getWorld().getEnabledFeatures())) {
            return ActionResult.FAIL;
        }
        if (!context.canPlace()) {
            return ActionResult.FAIL;
        }
        ItemPlacementContext itemPlacementContext = this.getPlacementContext(context);
        if (itemPlacementContext == null) {
            return ActionResult.FAIL;
        }
        BlockState blockState = this.getPlacementState(itemPlacementContext);
        if (blockState == null) {
            return ActionResult.FAIL;
        }
        if (!this.place(itemPlacementContext, blockState)) {
            return ActionResult.FAIL;
        }
        BlockPos blockPos = itemPlacementContext.getBlockPos();
        World world = itemPlacementContext.getWorld();
        PlayerEntity playerEntity = itemPlacementContext.getPlayer();
        ItemStack itemStack = itemPlacementContext.getStack();
        BlockState blockState2 = world.getBlockState(blockPos);
        if (blockState2.isOf(blockState.getBlock())) {
            blockState2 = this.placeFromNbt(blockPos, world, itemStack, blockState2);
            this.postPlacement(blockPos, world, playerEntity, itemStack, blockState2);
            blockState2.getBlock().onPlaced(world, blockPos, blockState2, playerEntity, itemStack);
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
            }
        }
        BlockSoundGroup blockSoundGroup = blockState2.getSoundGroup();
        world.playSound(playerEntity, blockPos, this.getPlaceSound(blockState2), SoundCategory.BLOCKS, (blockSoundGroup.getVolume() + 1.0f) / 2.0f, blockSoundGroup.getPitch() * 0.8f);
        world.emitGameEvent(GameEvent.BLOCK_PLACE, blockPos, GameEvent.Emitter.of(playerEntity, blockState2));
        if (playerEntity == null || !playerEntity.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return ActionResult.success(world.isClient);
    }

    private BlockState placeFromNbt(BlockPos pos, World world, ItemStack stack, BlockState state) {
        BlockState blockState = state;
        NbtCompound nbtCompound = stack.getNbt();
        if (nbtCompound != null) {
            NbtCompound nbtCompound2 = nbtCompound.getCompound(BLOCK_STATE_TAG_KEY);
            StateManager<Block, BlockState> stateManager = blockState.getBlock().getStateManager();
            for (String string : nbtCompound2.getKeys()) {
                Property<?> property = stateManager.getProperty(string);
                if (property == null) continue;
                String string2 = nbtCompound2.get(string).asString();
                blockState = BlockItem.with(blockState, property, string2);
            }
        }
        if (blockState != state) {
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
        }
        return blockState;
    }

}
 */


/*
public class ItemAngelBlock extends XUItemBlock {
	public ItemAngelBlock(Block block) {
		super(block);
	}

	@Nonnull
	@Override
	public ActionResult<ItemStack> onItemRightClick(@Nonnull ItemStack itemStackIn, World worldIn, EntityPlayer player, EnumHand hand) {
		if (worldIn.isRemote) return ActionResult.newResult(EnumActionResult.SUCCESS, itemStackIn);

		int x = (int) Math.floor(player.posX);
		int y = (int) Math.floor(player.posY + player.getEyeHeight());
		int z = (int) Math.floor(player.posZ);

		Vec3d look = player.getLookVec();

		EnumFacing side = EnumFacing.getFacingFromVector((float) look.x, (float) look.y, (float) look.z);

		switch (side) {
			case DOWN:
				y = (int) (Math.floor(player.getEntityBoundingBox().minY) - 1);
				break;
			case UP:
				y = (int) (Math.ceil(player.getEntityBoundingBox().maxY) + 1);
				break;
			case NORTH:
				z = (int) (Math.floor(player.getEntityBoundingBox().minZ) - 1);
				break;
			case SOUTH:
				z = (int) (Math.floor(player.getEntityBoundingBox().maxZ) + 1);
				break;
			case WEST:
				x = (int) (Math.floor(player.getEntityBoundingBox().minX) - 1);
				break;
			case EAST:
				x = (int) (Math.floor(player.getEntityBoundingBox().maxX) + 1);
				break;
		}

		BlockPos pos = new BlockPos(x, y, z);
		if (CompatHelper.canPlaceBlockHere(worldIn, block, pos, false, side, player, itemStackIn)) {
			itemStackIn.onItemUse(player, worldIn, pos, hand, side, 0, 0, 0);
		}

		return ActionResult.newResult(EnumActionResult.SUCCESS, itemStackIn);
	}
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
Extra-Utilities-2-Source/ItemAngelBlock.java at 9e478a1f48b559c404747c663cbb29bd8acf93d9 · rwtema/Extra-Utilities-2-Source
 */