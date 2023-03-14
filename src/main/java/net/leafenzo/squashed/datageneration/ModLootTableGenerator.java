package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CYAN_DYE_BLOCK);
        addDrop(ModBlocks.FIRE_CHARGE_BLOCK);
        //addDrop(ModBlocks.CYAN_DYE_BLOCK, dropsWithSilkTouchOrShears(ModBlocks.CYAN_DYE_BLOCK, null)); //TODO TESTME
    }

    //public LootTableGenerator(FabricDataGenerator dataGen) {
    //    super(dataGen, LootContextTypes.BLOCK);
    //}
}
