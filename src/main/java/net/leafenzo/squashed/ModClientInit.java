package net.leafenzo.squashed;

import net.fabricmc.api.ClientModInitializer;
import net.leafenzo.squashed.client.render.ModColorHandler;
import net.leafenzo.squashed.client.render.ModRenderLayers;

public class ModClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayers.registerBlockCutouts();
        ModColorHandler.registerBlockColorProviders();

//        HudRenderCallback.EVENT.register(new DenseCobwebHudOverlay());
    }
}
