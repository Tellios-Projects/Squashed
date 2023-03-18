package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_DYE_BLOCK);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CYAN_DYE_BLOCK, Super.asResource("block/cyan_dye_block"));

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_CHARGE_BLOCK);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.FIRE_CHARGE_BLOCK, Super.asResource("block/fire_charge_block"));
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}