/*
       SOURCES:
       Avetharun - https://github.com/avetharun/herbiary/blob/7017ddbf6d3fd1adddb451dc4b6ccdf93e72a3c3/remappedSrc/com/avetharun/herbiary/hUtil/alib.java#L208
 */

package net.leafenzo.squashed.util;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.*;

public class ModUtil {

    public static <T> T[] concat(T[] array1, T[] array2) {
        T[] result = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    public static String formatMultipleIdsForErrorLog(Block[] blocks) {
        String s = "{ ";
        for (int i = 0; i < blocks.length; i++) {
            s = s.concat(Registries.BLOCK.getId(blocks[i]).toString());
            if(i != blocks.length - 1) { s = s.concat(", "); } // if not the last entry
        }
        return s.concat(" }");
    }

    public static String toSentanceCase(String s) {
        String words[] = s.split("[\\s|_]");
        StringBuilder capitalizeWord = new StringBuilder();
        for(String w : words){
            String first = w.substring(0,1);
            String afterfirst = w.substring(1);
            capitalizeWord
                    .append(first.toUpperCase())
                    .append(afterfirst)
                    .append(" ");
        }
        return capitalizeWord.toString().trim();
    }


    public static Set<Identifier> allBlockIdsInNamespace(String namespace) {
        Set<Identifier> set = Registries.BLOCK.getIds();
        Set<Identifier> a = new HashSet<>();
        for(Identifier id : set) {
            if(Objects.equals(id.getNamespace(), namespace)) {
                a.add(id);
            }
        }
        return a;
    }
    public static Set<Identifier> allItemIdsInNamespace(String namespace) {
        Set<Identifier> set = Registries.ITEM.getIds();
        Set<Identifier> a = new HashSet<>();
        for(Identifier id : set) {
            if(Objects.equals(id.getNamespace(), namespace)) {
                a.add(id);
            }
        }
        return a;
    }
//    public static Set<Identifier> allItemGroupIdsInNamespace(String namespace) {
//        Set<Identifier> set = Registries.ITEM_GROUP.getIds();
//        Set<Identifier> a = new HashSet<>();
//        for (Identifier id : set) {
//            if (Objects.equals(id.getNamespace(), namespace)) {
//                a.add(id);
//            }
//        }
//        return a;
//    }


     /*
           SOURCE:
           Avetharun - https://github.com/avetharun/herbiary/blob/7017ddbf6d3fd1adddb451dc4b6ccdf93e72a3c3/remappedSrc/com/avetharun/herbiary/hUtil/alib.java#L208
     */
    public static ArrayList<Block> allBlocksInTag(TagKey<Block> tag) {
        ArrayList<Block> blocks = new ArrayList<>();
        Optional<RegistryEntryList.Named<Block>> init_BLOCKS = Registries.BLOCK.getEntryList(tag);
        init_BLOCKS.ifPresent(registryEntries -> registryEntries.forEach(entry -> {
            blocks.add(entry.value());
        }));
        return blocks;
    }
}
