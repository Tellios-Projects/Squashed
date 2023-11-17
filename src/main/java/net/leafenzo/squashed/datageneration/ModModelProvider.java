package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.data.client.ModTexturedModel;
import net.leafenzo.squashed.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    protected static void registerPufferfishBlock(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier off_model = ModelIds.getBlockModelId(ModBlocks.PUFFERFISH_BLOCK);
        Identifier on_model = ModelIds.getBlockSubModelId(ModBlocks.PUFFERFISH_BLOCK, "_on");
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PUFFERFISH_BLOCK)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.POWERED, on_model, off_model))
                .coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates())
        );
    }

    public void registerLogPile(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createLogPileBlockState(block, identifier));
    }
    public static BlockStateSupplier createLogPileBlockState(Block block, Identifier modelId) {
            return VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, modelId)).coordinate(createLogPileVariantMap());
    }
    public static BlockStateVariantMap createLogPileVariantMap() {
        //X and Z states are swapped, because this is a way to make these place so that the lines on the north face lead away from the player when it's places on those axis. Not the only way of doing this, hacky fix.
            return BlockStateVariantMap.create(Properties.AXIS).register(Direction.Axis.Y, BlockStateVariant.create()).register(Direction.Axis.Z, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(Direction.Axis.X, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90));
    }

//    protected static void registerDenseCobwebBlock(BlockStateModelGenerator blockStateModelGenerator) {
//        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.DENSE_COBWEB_BLOCK);
//        //blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.DENSE_COBWEB_BLOCK).coordinate(BlockStateModelGenerator.buildBlockStateVariants(Identifier, )));
//        //blockStateModelGenerator.registerStateWithModelReference(ModBlocks.DENSE_COBWEB_BLOCK, ModBlocks.DENSE_COBWEB_BLOCK);
//    }
//    protected static void registerCompressedSpongeBlock(BlockStateModelGenerator blockStateModelGenerator) {
//        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.COMPRESSED_SPONGE);
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.COMPRESSED_SPONGE));
//        //blockStateModelGenerator.registerStateWithModelReference(ModBlocks.COMPRESSED_SPONGE, ModBlocks.COMPRESSED_SPONGE);
//    }
//    protected static void registerRotatable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
//        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
//        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createBlockStateWithRandomHorizontalRotations(block, identifier));
//    }
//
//    protected static void registerNorthDefaultFacing(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
//        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(BlockStateModelGenerator.createSouthDefaultHorizontalRotationStates()));
//    }
//    private void registerNorthDefaultRotatable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
//        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates()));
//    }

    //    protected static void registerSeaPickleBlock(BlockStateModelGenerator blockStateModelGenerator) {
//        Identifier identifier = ModelIds.getBlockModelId(ModBlocks.SEA_PICKLE_BLOCK);
//        Identifier identifier2 = ModelIds.getBlockSubModelId(ModBlocks.SEA_PICKLE_BLOCK, "_wet");
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.SEA_PICKLE_BLOCK).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.WATERLOGGED, identifier2, identifier)));
//    }


    private void registerNorthDefaultOrientable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates()));
        //blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates(), identifier));
    }

    private void registerUpDefaultOrientable(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(createUpDefaultRotationStates()));
        //blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates(), identifier));
    }

    private void registerHorizontalAxisRotated(BlockStateModelGenerator blockStateModelGenerator, Block block, TexturedModel.Factory modelFactory) {
        Identifier identifier = modelFactory.upload(block, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create().put(VariantSettings.MODEL, identifier)).coordinate(createHorizontalAxisRotationStates()));
        //blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(BlockStateModelGenerator.createNorthDefaultRotationStates(), identifier));
    }

    private static BlockStateVariantMap createUpDefaultRotationStates() {
        return BlockStateVariantMap.create(Properties.FACING).register(Direction.DOWN, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R180)).register(Direction.UP, BlockStateVariant.create()).register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90)).register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.Y, VariantSettings.Rotation.R270)).register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90).put(VariantSettings.Y, VariantSettings.Rotation.R90));
    }

    private static BlockStateVariantMap createHorizontalAxisRotationStates() {
        return BlockStateVariantMap.create(Properties.HORIZONTAL_AXIS)
                .register(Direction.Axis.X, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .register(Direction.Axis.Z, BlockStateVariant.create());
    }

    //Because the last one is just the texture with the insignia on it
    private void registerCompressedLogs(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        if(ModBlocks.COMPRESSION_TIER_FROM_BLOCK.get(block) == 3) {
            blockStateModelGenerator.registerCubeAllModelTexturePool(block);
        }
        else {
            blockStateModelGenerator.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);
        }
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Block Models
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.BLAZE_ROD_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.INK_SAC_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STICK_BLOCK, TexturedModel.CUBE_ALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FIRE_CHARGE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZE_POWDER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_SALMON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_SALMON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_COD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_COD_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_RABBIT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_RABBIT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_MUTTON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_MUTTON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_CHICKEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_CHICKEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_BEEF_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_BEEF_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_PORK_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COOKED_PORK_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROTTEN_FLESH_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIDER_EYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHEAT_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PUMPKIN_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEETROOT_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MELON_SEED_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COCOA_BEANS_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEAD_BUSH_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOW_BERRIES_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SWEET_BERRIES_BLOCK);
        blockStateModelGenerator.registerSingleton(ModBlocks.GRASS_CLIPPINGS_BLOCK, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.FERN_BLOCK, TexturedModel.LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOW_LICHEN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_PUMPKIN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_HAY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MELON);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUGARCANE_BLOCK);

        for(Block block : ModBlocks.COMPACTED_SOUL_SAND) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_SOUL_SOIL) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_COBBLESTONE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_STONE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_ANDESITE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_GRAVEL) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_TUFF) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_BLACKSTONE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_OBSIDIAN) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_DEEPSLATE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_NETHERRACK) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_END_STONE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_DIORITE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_GRANITE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_DIRT) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_SAND) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_RED_SAND) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_DRIPSTONE_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_CALCITE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_MUD) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_MOSS_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_CLAY) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_MAGMA_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_SNOW_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_BASALT) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_COBBLED_DEEPSLATE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_SCULK) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_PRISMARINE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_BLUE_ICE) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_GLOWSTONE_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_RAW_IRON_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_RAW_GOLD_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_RAW_COPPER_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_REDSTONE_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_COAL_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_QUARTZ_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_IRON_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_NETHERITE_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_GOLD_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_DIAMOND_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_EMERALD_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_LAPIS_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_AMETHYST_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_BONE_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        for(Block block : ModBlocks.COMPACTED_COPPER_BLOCKS) { blockStateModelGenerator.registerCubeAllModelTexturePool(block); }
        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_COPPER_BLOCK); // covered by compressed copper blocks
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_EXPOSED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_WEATHERED_COMPRESSED_COPPER_BLOCK);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_COMPRESSED_COPPER_BLOCK, ModBlocks.WAXED_OXIDIZED_COMPRESSED_COPPER_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_DYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_DYE_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.WHITE_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.ORANGE_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.MAGENTA_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.LIGHT_BLUE_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.YELLOW_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.LIME_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.PINK_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GRAY_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.LIGHT_GRAY_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CYAN_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.PURPLE_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BLUE_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BROWN_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GREEN_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.RED_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BLACK_COMPRESSED_WOOL, ModTexturedModel.COMPRESSED_WOOL);
        blockStateModelGenerator.registerSingleton(ModBlocks.BOOK_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_OAK_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SPRUCE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_BIRCH_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_JUNGLE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_ACACIA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DARK_OAK_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MANGROVE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_AZALEA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.LEATHER_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_OAK_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SPRUCE_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_BIRCH_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_JUNGLE_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_ACACIA_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_DARK_OAK_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_AZALEA_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_FLOWERING_AZALEA_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_MANGROVE_PROPAGULE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CRIMSON_FUNGUS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_WARPED_FUNGUS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHORUS_FRUIT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_SEAGRASS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_CACTUS, TexturedModel.CUBE_COLUMN);


        blockStateModelGenerator.registerSingleton(ModBlocks.TROPICAL_FISH_BLOCK_A, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_B, TexturedModel.CUBE_ALL);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_C, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_D, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_E, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_F, TexturedModel.CUBE_BOTTOM_TOP);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_G, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_H, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_I, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_J, TexturedModel.CUBE_BOTTOM_TOP);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_K, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_L, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_M, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_N, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_O, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_P, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_Q, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_R, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_S, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_T, TexturedModel.CUBE_COLUMN);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.TROPICAL_FISH_BLOCK_U, TexturedModel.CUBE_BOTTOM_TOP);

        for(Block block : ModBlocks.COMPACTED_OAK_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_SPRUCE_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_BIRCH_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_JUNGLE_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_ACACIA_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_DARK_OAK_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_MANGROVE_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_CHERRY_LOGS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_CRIMSON_STEMS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_WARPED_STEMS) { registerCompressedLogs(blockStateModelGenerator, block); }
        for(Block block : ModBlocks.COMPACTED_BAMBOO_BLOCKS) { registerCompressedLogs(blockStateModelGenerator, block); }

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOW_INK_SAC_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SCUTE_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GHAST_TEAR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PHANTOM_MEMBRANE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_NETHER_WART_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_WARPED_WART_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.MANGROVE_ROOTS_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.VINE_BLOCK, TexturedModel.LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EGG_BLOCK);
        registerPufferfishBlock(blockStateModelGenerator);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BONES_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.PAPER_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.COMPRESSED_SCAFFOLDING, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KELP_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDER_EYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDER_PEARL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ECHO_SHARD_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.RABBIT_HIDE_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_CHERRY_SAPLING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CARROT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDEN_CARROT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.APPLE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLDEN_APPLE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POTATO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POISONOUS_POTATO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAKED_POTATO_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BEETROOT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLINT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUGAR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GUNPOWDER_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CHARCOAL_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SNOWBALL_BLOCK);
        registerUpDefaultOrientable(blockStateModelGenerator, ModBlocks.AMETHYST_SHARD_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CRYSTAL_QUARTZ_BLOCK, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HEART_OF_THE_SEA_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NAUTILUS_SHELL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_STAR_BLOCK);

        registerHorizontalAxisRotated(blockStateModelGenerator, ModBlocks.BRICKS_BLOCK, ModTexturedModel.CUBE_COLUMN_DEFAULT_TO_SIDE);
        registerHorizontalAxisRotated(blockStateModelGenerator, ModBlocks.NETHER_BRICKS_BLOCK, ModTexturedModel.CUBE_COLUMN_DEFAULT_TO_SIDE);
//        blockStateModelGenerator.registerSingleton(ModBlocks.BRICKS_BLOCK, ModTexturedModel.CUBE_COLUMN_DEFAULT_TO_SIDE);
//        blockStateModelGenerator.registerSingleton(ModBlocks.NETHER_BRICKS_BLOCK, ModTexturedModel.CUBE_COLUMN_DEFAULT_TO_SIDE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FERMENTED_SPIDER_EYE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLISTERING_MELON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COMPRESSED_GLISTERING_MELON_BLOCK);

        // BlockItem Models  // For anything that does not use datagen to supply models elsewhere
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MAGMA_CREAM_BLOCK, Super.asResource("block/magma_cream_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SEA_PICKLE_BLOCK, Super.asResource("block/sea_pickle_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.PUFFERFISH_BLOCK, Super.asResource("block/pufferfish_block_on"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.COMPRESSED_SPONGE, Super.asResource("block/compressed_sponge"));
//        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DENSE_COBWEB_BLOCK, Super.asResource("block/dense_cobweb_block")); // unneeded here as it has a custom item model as well
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.FEATHER_BLOCK, Super.asResource("block/feather_block"));
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BUNDLED_ARROWS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUNDLED_BOTTLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUNDLED_LEADS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUNDLED_NAMETAGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUNDLED_SPECTRAL_ARROWS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUNDLED_STICKS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STACKED_BOWLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STACKED_BUCKETS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STACKED_MINECARTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STACKED_POWERED_RAILS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STACKED_RAILS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STACKED_SADDLES, Models.GENERATED);
    }
}