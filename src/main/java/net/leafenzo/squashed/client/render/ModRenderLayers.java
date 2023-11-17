package net.leafenzo.squashed.client.render;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ModRenderLayers {
    public static void registerRenderLayers() {
        ModInit.LOGGER.debug("Registering render layers for " + Super.MOD_ID);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                ModBlocks.DENSE_COBWEB_BLOCK,
                ModBlocks.COMPRESSED_SPONGE,
                ModBlocks.SEA_PICKLE_BLOCK,
                ModBlocks.DEAD_BUSH_BLOCK,
                ModBlocks.GLOW_BERRIES_BLOCK,
                ModBlocks.SWEET_BERRIES_BLOCK
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.MAGMA_CREAM_BLOCK,
                ModBlocks.COMPACTED_QUARTZ_BLOCKS[0],
                ModBlocks.COMPACTED_DIAMOND_BLOCKS[0],
                ModBlocks.COMPACTED_EMERALD_BLOCKS[0],
                ModBlocks.COMPACTED_AMETHYST_BLOCKS[0],
                ModBlocks.COMPACTED_OBSIDIAN[0],
                ModBlocks.NETHER_STAR_BLOCK
        );
    }
}
