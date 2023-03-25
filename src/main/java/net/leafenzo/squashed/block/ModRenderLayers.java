package net.leafenzo.squashed.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ModRenderLayers {
    public static void registerBlockCutouts() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.DENSE_COBWEB_BLOCK,
                ModBlocks.COMPRESSED_SPONGE
        );

        //BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
    }
}
