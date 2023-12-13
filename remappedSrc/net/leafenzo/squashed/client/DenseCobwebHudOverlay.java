package net.leafenzo.squashed.client;

//public class DenseCobwebHudOverlay implements HudRenderCallback {
//    private static final Identifier DENSE_COBWEB_OUTLINE = Super.asResource("textures/misc/dense_cobweb_outline.png");
//    private int scaledWidth;
//    private int scaledHeight;
//    private MinecraftClient client;
//
//    @Override
//    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
//        client = MinecraftClient.getInstance();
//        if (client != null) {
//            scaledWidth= client.getWindow().getScaledWidth();
//            scaledHeight= client.getWindow().getScaledHeight();
//
//            this.renderDenseCobwebOverlay(DENSE_COBWEB_OUTLINE, 0.5f);  //TODO FIXME
//            //TODO Make sure this is displayed AFTER pumpkin fx!
//        }
//    }
//
//    private void renderDenseCobwebOverlay(Identifier texture, float opacity) {
//        //If camera is within a Dense Cobweb Block (in any POV. Not in spectator mode)
//
//        //Get rotation of camera
//        Quaternionf cameraRotation = client.gameRenderer.getCamera().getRotation(); // TODO FIXME
//        float step = 5;
//        float x = cameraRotation.x / step;
//        float y = cameraRotation.y / step;
//        float z = cameraRotation.z / step;
//
////        float x = Math.round(cameraRotation.x / step);
////        float y = Math.round(cameraRotation.y / step);
////        float z = Math.round(cameraRotation.z / step);
//
//        // Wrap texture
//
//        // Offset it by some amount + the camera rotation
//
//        RenderSystem.disableDepthTest();
//        RenderSystem.depthMask(false);
//        RenderSystem.defaultBlendFunc();
//        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
//        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, opacity);
//        RenderSystem.setShaderTexture(0, texture);
//        Tessellator tessellator = Tessellator.getInstance();
//        BufferBuilder bufferBuilder = tessellator.getBuffer();
//        bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
//        bufferBuilder.vertex(0.0 + x, this.scaledHeight, -90.0 + z).texture(0.0f, 1.0f).next();
//        bufferBuilder.vertex(this.scaledWidth, this.scaledHeight, -90.0 + z).texture(1.0f, 1.0f).next();
//        bufferBuilder.vertex(this.scaledWidth, 0.0 + y, -90.0 + z).texture(1.0f, 0.0f).next();
//        bufferBuilder.vertex(0.0 + x, 0.0 + y, -90.0 + z).texture(0.0f, 0.0f).next();
//        tessellator.draw();
//        RenderSystem.depthMask(true);
//        RenderSystem.enableDepthTest();
//        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
//    }
//}
