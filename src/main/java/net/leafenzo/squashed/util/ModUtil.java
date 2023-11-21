package net.leafenzo.squashed.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
    public static Set<Identifier> allItemGroupIdsInNamespace(String namespace) {
        Set<Identifier> set = Registries.ITEM_GROUP.getIds();
        Set<Identifier> a = new HashSet<>();
        for(Identifier id : set) {
            if(Objects.equals(id.getNamespace(), namespace)) {
                a.add(id);
            }
        }
        return a;
    }

    public static BlockState[] allAdjacentBlockStates(World world, BlockPos pos) {
        BlockState[] states = new BlockState[5];
        states[0] = world.getBlockState(pos.up());
        states[1] = world.getBlockState(pos.down());
        states[2] = world.getBlockState(pos.north());
        states[3] = world.getBlockState(pos.south());
        states[4] = world.getBlockState(pos.east());
        states[5] = world.getBlockState(pos.west());
        return states;
    }
}
