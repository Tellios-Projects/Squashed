package net.leafenzo.squashed.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leafenzo.squashed.ModInit;
import net.leafenzo.squashed.Super;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    /** Debug Owo */
//    public static final Item CAT_FOOD = registerItem(
//            "cat_food",
//            new Item(new Item.Settings()),
//            ItemGroups.SQUASHED
//    );
    public static final Item BUNDLED_ARROWS = registerItem("bundled_arrows", new Item(new FabricItemSettings()));
    public static final Item BUNDLED_BOTTLES = registerItem("bundled_bottles", new Item(new FabricItemSettings()));
    public static final Item BUNDLED_LEADS = registerItem("bundled_leads", new Item(new FabricItemSettings()));
    public static final Item BUNDLED_NAMETAGS = registerItem("bundled_nametags", new Item(new FabricItemSettings()));
    public static final Item BUNDLED_SPECTRAL_ARROWS = registerItem("bundled_spectral_arrows", new Item(new FabricItemSettings()));
    public static final Item BUNDLED_STICKS = registerItem("bundled_sticks", new Item(new FabricItemSettings()));
    public static final Item STACKED_BOWLS = registerItem("stacked_bowls", new Item(new FabricItemSettings()));
    public static final Item STACKED_BUCKETS = registerItem("stacked_buckets", new Item(new FabricItemSettings()));
    public static final Item STACKED_MINECARTS = registerItem("stacked_minecarts", new Item(new FabricItemSettings()));
    public static final Item STACKED_POWERED_RAILS = registerItem("stacked_powered_rails", new Item(new FabricItemSettings()));
    public static final Item STACKED_RAILS = registerItem("stacked_rails", new Item(new FabricItemSettings()));
    public static final Item STACKED_SADDLES = registerItem("stacked_saddles", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        //ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, name), item);
    }
    private static Item registerItem(String name, Item item, ItemGroup group) {
        //ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(Super.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ModInit.LOGGER.debug("Registering mod items for " + Super.MOD_ID);
    }
}
