package net.leafenzo.squashed.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModTexturedModel {
    public static final TexturedModel.Factory LOG_PILE = TexturedModel.makeFactory(ModTexturedModel::logPile, Models.CUBE_DIRECTIONAL);
    public static final TexturedModel.Factory CUBE_COLUME_SIDE_DOUBLE_FRONT = TexturedModel.makeFactory(ModTexturedModel::cubeColumnSideDoubleFront, Models.CUBE);

    public static final Model CUBE_DIRECTIONAL_DOWN_ROTATED = ModTexturedModel.block("minecraft:block/cube_directional", TextureKey.PARTICLE, TextureKey.NORTH, TextureKey.SOUTH, TextureKey.EAST, TextureKey.WEST, TextureKey.UP, TextureKey.DOWN);



    private static Model block(String path, TextureKey ... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(path)), Optional.empty(), requiredTextureKeys);
    }


    public static TextureMap logPile(Block block) {
        return  new TextureMap()
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.NORTH, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.SOUTH, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.EAST, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.WEST, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.UP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.DOWN, TextureMap.getSubId(block, "_top"))
                ;
    }

    public static TextureMap cubeColumnSideDoubleFront(Block block) {
        return  new TextureMap()
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.NORTH, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.SOUTH, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.EAST, TextureMap.getSubId(block, "_front"))
                .put(TextureKey.WEST, TextureMap.getSubId(block, "_front"))
                .put(TextureKey.UP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.DOWN, TextureMap.getSubId(block, "_top"))
                ;
    }
}
