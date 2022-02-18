package com.raw.black_belt.nbb003_collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class Nbb21HashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Xena");
        set1.add("Xenos");
        set1.add("X-man");
        set1.add("X-man");
        set1.add(null);
        set1.add("X-factor");
//        System.out.println(set1);
        for (String s: set1){
            System.out.println(s);
        }

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(5);
        set2.add(2);
        set2.add(7);
        Set<Integer> set3 = new HashSet<>();
        set3.add(11);
        set3.add(5);
        set3.add(2);
        set3.add(71);
        Set<Integer> setUnion = new HashSet<>(set2);
        setUnion.addAll(set3);
        System.out.println(setUnion);

        Set<Integer> setIntersect = new HashSet<>(set2);
        setIntersect.retainAll(set3);
        System.out.println(setIntersect);

        Set<Integer> setSubtract = new HashSet<>(set2);
        setSubtract.removeAll(set3);
        System.out.println(setSubtract);
    }
}
