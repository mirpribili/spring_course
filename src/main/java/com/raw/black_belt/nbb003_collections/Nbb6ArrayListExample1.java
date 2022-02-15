package com.raw.black_belt.nbb003_collections;

import java.util.ArrayList;
import java.util.List;

public class Nbb6ArrayListExample1 {
    public static void main(String[] args) {
        // first type of create
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Mary");
        arrayList1.add("Zaur2");
        System.out.println(arrayList1);
        // second type of create
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Mary");
        arrayList2.add("Zaur2");
        System.out.println(arrayList2);
        // third type of create
        List<String> arrayList3 = new ArrayList<>(); // тк List это интерфейс который имплементирует ArrayList
        arrayList3.add("Zaur");
        arrayList3.add("Mary");
        arrayList3.add("Zaur2");
        System.out.println(arrayList3);
        // fourth type of create
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);


    }
}
