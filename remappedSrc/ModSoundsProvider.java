//package net.leafenzo.squashed.datageneration;
//
//import com.google.common.collect.Maps;
//import com.google.common.collect.Sets;
//import com.google.gson.JsonElement;
//import net.minecraft.block.Block;
//import net.minecraft.data.DataOutput;
//import net.minecraft.data.DataProvider;
//import net.minecraft.data.DataWriter;
//import net.minecraft.data.client.*;
//import net.minecraft.item.Item;
//import net.minecraft.registry.Registries;
//import net.minecraft.util.Identifier;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.function.BiConsumer;
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//
//public class ModSoundsProvider
//implements DataProvider {
//    private final DataOutput.PathResolver soundsPathResolver;
//
//    public ModSoundsProvider(DataOutput output) {
//        this.soundsPathResolver = output.getResolver(DataOutput.OutputType.RESOURCE_PACK, "sounds");
//        //this.modelsPathResolver = output.getResolver(DataOutput.OutputType.RESOURCE_PACK, "models");
//    }
//
//    @Override
//    public CompletableFuture<?> run(DataWriter writer) {
//        HashMap map = Maps.newHashMap();
//        Consumer<BlockStateSupplier> consumer = soundsSupplier -> {
//            Block block = soundsSupplier.getBlock();
//             blockStateSupplier2 = map.put(block, soundsSupplier);
//            if (blockStateSupplier2 != null) {
//                throw new IllegalStateException("Duplicate blockstate definition for " + block);
//            }
//        };
//        Consumer<Item> consumer2 = set::add;
//        new BlockStateModelGenerator(consumer, biConsumer, consumer2).register();
//        new ItemModelGenerator(biConsumer).register();
//        List<Block> list = Registries.BLOCK.stream().filter(block -> !map.containsKey(block)).toList();
//        if (!list.isEmpty()) {
//            throw new IllegalStateException("Missing blockstate definitions for: " + list);
//        }
//        Registries.BLOCK.forEach(block -> {
//            Item item = Item.BLOCK_ITEMS.get(block);
//            if (item != null) {
//                if (set.contains(item)) {
//                    return;
//                }
//                Identifier identifier = ModelIds.getItemModelId(item);
//                if (!map2.containsKey(identifier)) {
//                    map2.put(identifier, new SimpleModelSupplier(ModelIds.getBlockModelId(block)));
//                }
//            }
//        });
//        CompletableFuture[] completableFutureArray = new CompletableFuture[2];
//        completableFutureArray[0] = this.writeJsons(writer, map, block -> this.blockstatesPathResolver.resolveJson(block.getRegistryEntry().registryKey().getValue()));
//        completableFutureArray[1] = this.writeJsons(writer, map2, this.modelsPathResolver::resolveJson);
//        return CompletableFuture.allOf(completableFutureArray);
//    }
//
//}
