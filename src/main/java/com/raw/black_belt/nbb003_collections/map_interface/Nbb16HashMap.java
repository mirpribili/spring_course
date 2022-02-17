package com.raw.black_belt.nbb003_collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class Nbb16HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Xena Zena");
        map1.put(1200, "Mykola Nikola");
        map1.put(800, "Mickael Pica-lo");
        map1.put(1800, "Mick Mouse");
        map1.put(1800, "Mick Mouse");
        map1.put(null, "Mick Mouse");
        map1.put(null, null);
        System.out.println(map1);
        System.out.println(map1.get(null));

    }
}
