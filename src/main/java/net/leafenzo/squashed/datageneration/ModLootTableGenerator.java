package net.leafenzo.squashed.datageneration;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.leafenzo.squashed.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.TntBlock;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LimitCountLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.function.Function;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    public static final ArrayList<Block> usedBlocks = new ArrayList<Block>();

    protected static final float[] SAPLING_DROP_CHANCE = new float[]{0.05f, 0.0625f, 0.083333336f, 0.1f};
    private static final float[] LEAVES_STICK_DROP_CHANCE = new float[]{0.02f, 0.022222223f, 0.025f, 0.033333335f, 0.1f};
    private static final float[] JUNGLE_SAPLING_DROP_CHANCE = new float[]{0.025f, 0.027777778f, 0.03125f, 0.041666668f, 0.1f};
    public static final float[] NO_CHANCE_AT_ALL_NOPE = new float[]{0f, 0f, 0f, 0.0000000001f};

    public void addDrop(Block block, ItemConvertible drop) {
        this.addDrop(block, this.drops(drop));
        usedBlocks.add(block);
    }
    public void addDrop(Block block, Function<Block, LootTable.Builder> lootTableFunction) {
        addDrop(block, lootTableFunction.apply(block));
        usedBlocks.add(block);
    }
    public void addDrop(Block block) {
        addDrop(block, block);
        usedBlocks.add(block);
    }
    public void addDrop(Block block, LootTable.Builder lootTable) {
        this.lootTables.put(block.getLootTableId(), lootTable);
        usedBlocks.add(block);
    }

    @Override
    public void generate() {
        //Manual
        this.addDrop(ModBlocks.GRASS_CLIPPINGS_BLOCK, (Block block) -> this.drops((Block)block, block));
        for(Block block : ModBlocks.DYE_BLOCKS) { this.addDrop(block); }
        for(Block block : ModBlocks.ALL_COMPACTED_WOOL_BLOCKS) { this.addDrop(block); }
        this.addDrop(ModBlocks.BOOK_BLOCK, (Block block) -> this.drops((Block)block, Items.BOOK, ConstantLootNumberProvider.create(9.0f)));
        this.addDrop(ModBlocks.COMPRESSED_OAK_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_SPRUCE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.SPRUCE_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_BIRCH_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.BIRCH_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_JUNGLE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.JUNGLE_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_ACACIA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.ACACIA_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_DARK_OAK_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.DARK_OAK_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_MANGROVE_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.MANGROVE_PROPAGULE, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_AZALEA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.AZALEA, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_FLOWERING_AZALEA_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.FLOWERING_AZALEA, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.COMPRESSED_CHERRY_LEAVES, (Block block) -> this.leavesDrops((Block)block, Blocks.CHERRY_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.VINE_BLOCK, (Block block) -> this.drops((Block)block, block));
        this.addDropWithSilkTouch(ModBlocks.EGG_BLOCK);
        this.addDrop(ModBlocks.GUNPOWDER_BLOCK, LootTable.builder().pool(this.addSurvivesExplosionCondition(ModBlocks.GUNPOWDER_BLOCK, LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f)).with((LootPoolEntry.Builder<?>) ItemEntry.builder(ModBlocks.GUNPOWDER_BLOCK).conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.GUNPOWDER_BLOCK).properties(StatePredicate.Builder.create().exactMatch(TntBlock.UNSTABLE, false)))))));
        this.addDrop(ModBlocks.SNOWBALL_BLOCK, (Block block) -> this.drops((Block)block, Items.SNOWBALL, UniformLootNumberProvider.create(7.0f, 9.0f)));
        this.addDrop(ModBlocks.GLISTERING_MELON_BLOCK, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, (LootPoolEntry.Builder)this.applyExplosionDecay((ItemConvertible)block, ((LeafEntry.Builder)((LeafEntry.Builder)ItemEntry.builder(Items.GLISTERING_MELON_SLICE).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 7.0f)))).apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE))).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.createMax(9))))));
        this.addDrop(ModBlocks.COMPRESSED_TNT, LootTable.builder().pool(this.addSurvivesExplosionCondition(ModBlocks.COMPRESSED_TNT, LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f)).with((LootPoolEntry.Builder<?>) ItemEntry.builder(ModBlocks.COMPRESSED_TNT).conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.COMPRESSED_TNT).properties(StatePredicate.Builder.create().exactMatch(TntBlock.UNSTABLE, false)))))));
        this.addDrop(ModBlocks.CLAY_BALL_BLOCK, (Block block) -> this.drops((Block)block, Items.CLAY_BALL, UniformLootNumberProvider.create(7.0f, 9.0f)));
        this.addDropWithSilkTouch(ModBlocks.EXPERIENCE_BLOCK);
        this.addDrop(ModBlocks.PINK_PETAL_BLOCK, (Block block) ->  this.leavesDrops((Block)block, ModBlocks.COMPACTED_NETHERITE_BLOCKS[3], NO_CHANCE_AT_ALL_NOPE));

        //Automatic
        for(Identifier id : ModUtil.allBlockIdsInNamespace(Super.MOD_ID)) {
            Block block = Registries.BLOCK.get(id);
            if(usedBlocks.contains(block)) { continue; }
            this.addDrop(block);
        }
    }
}
