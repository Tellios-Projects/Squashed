package net.leafenzo.squashed.registries;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.leafenzo.squashed.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModVillagerTrades {
    public static void registerVillagerTrades() {
        ModInit.LOGGER.debug("Registering villager trades for " + Super.MOD_ID);

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModBlocks.EXPERIENCE_BLOCK, 4),
                            14, 5, 0.15f))
                    );
                }
        );

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    //multiple identical experience block trades, otherwise it would be far too rare for someone to ever run into this trade
                    factories.add(((entity, random) -> new TradeOffer( new ItemStack(Items.EMERALD, 6), new ItemStack(ModBlocks.EXPERIENCE_BLOCK, 1), 16, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer( new ItemStack(Items.EMERALD, 6), new ItemStack(ModBlocks.EXPERIENCE_BLOCK, 1), 16, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer( new ItemStack(Items.EMERALD, 6), new ItemStack(ModBlocks.EXPERIENCE_BLOCK, 1), 16, 5, 0.15f)));

                    //six varieties of tropical fish blocks
                    factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(ModBlocks.TROPICAL_FISH_BLOCK_A, 1), 42, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(ModBlocks.TROPICAL_FISH_BLOCK_B, 1), 42, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(ModBlocks.TROPICAL_FISH_BLOCK_F, 1), 42, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(ModBlocks.TROPICAL_FISH_BLOCK_O, 1), 42, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(ModBlocks.TROPICAL_FISH_BLOCK_P, 1), 42, 5, 0.15f)));
                    factories.add(((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 2), new ItemStack(ModBlocks.TROPICAL_FISH_BLOCK_Q, 1), 42, 5, 0.15f)));
                }
        );
    }
}
