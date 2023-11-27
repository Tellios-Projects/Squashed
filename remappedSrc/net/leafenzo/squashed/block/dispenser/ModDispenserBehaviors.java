package net.leafenzo.squashed.block.dispenser;

import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.block.DispenserBlock;

public class ModDispenserBehaviors {
    public static void RegisterDispenserBehaviors() {
        ModInit.LOGGER.debug("Registering dispenser behaviors for " + Super.MOD_ID);

        DispenserBlock.registerBehavior(ModBlocks.REDSTONE_DUST_BLOCK, new FallingBlockPlacementDispenserBehavior());
        DispenserBlock.registerBehavior(ModBlocks.GLOWSTONE_DUST_BLOCK, new FallingBlockPlacementDispenserBehavior());
        DispenserBlock.registerBehavior(ModBlocks.GUNPOWDER_BLOCK, new FallingBlockPlacementDispenserBehavior());
        DispenserBlock.registerBehavior(ModBlocks.EGG_BLOCK, new FallingBlockPlacementDispenserBehavior());
        DispenserBlock.registerBehavior(ModBlocks.COMPRESSED_TNT, new CompressedTntDispenserBehavior());
    }
}
