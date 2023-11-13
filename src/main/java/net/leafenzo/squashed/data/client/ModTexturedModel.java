package net.leafenzo.squashed.data.client;

import net.leafenzo.squashed.Super;
import net.minecraft.block.Block;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.TexturedModel;

public class ModTexturedModel {
    public static final TexturedModel.Factory LOG_PILE = TexturedModel.makeFactory(ModTexturedModel::logPile, ModModels.CUBE_DIRECTIONAL_DOWN_ROTATED);
    public static final TexturedModel.Factory CUBE_COLUME_SIDE_DOUBLE_FRONT = TexturedModel.makeFactory(ModTexturedModel::cubeColumnSideDoubleFront, Models.CUBE);
    public static final TexturedModel.Factory COMPRESSED_WOOL = TexturedModel.makeFactory(ModTexturedModel::compressedWool, Models.CUBE);

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

    public static TextureMap compressedWool(Block block) {
        return  new TextureMap()
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.NORTH, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.SOUTH, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.EAST, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.WEST, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.UP, Super.asResource("block/compressed_wool_top"))
                .put(TextureKey.DOWN, Super.asResource("block/compressed_wool_top"))
                ;
    }
}
