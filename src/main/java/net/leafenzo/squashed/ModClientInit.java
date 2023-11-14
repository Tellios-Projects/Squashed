package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.client.render.ModColorHandler;
import net.leafenzo.squashed.client.render.ModRenderLayers;
import net.leafenzo.squashed.entity.ModEntityRenderers;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayers.registerRenderLayers();
        ModColorHandler.registerBlockColorProviders();
        ModEntityRenderers.registerEntityRenderers();

//        HudRenderCallback.EVENT.register(new DenseCobwebHudOverlay());
    }
}
