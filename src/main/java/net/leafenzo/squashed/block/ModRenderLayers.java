package net.leafenzo.squashed.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ModRenderLayers {
    public static void registerBlockCutouts() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                ModBlocks.DENSE_COBWEB_BLOCK,
                ModBlocks.COMPRESSED_SPONGE
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.COMPRESSED_AMETHYST_BLOCK,
                ModBlocks.COMPRESSED_QUARTZ_BLOCK
        );
    }
}
