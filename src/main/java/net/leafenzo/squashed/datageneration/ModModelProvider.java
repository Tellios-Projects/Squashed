package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
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
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_CHARGE_BLOCK);
        //blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.CYAN_DYE_BLOCK, ee);
        //blockStateModelGenerator.registerAxisRotated(ModBlocks.CYAN_DYE_BLOCK, CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.);
    }
}
