package com.raw.black_belt.nbb003_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Nbb10Iterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Mary");
        arrayList1.add("Zaur2");
        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove(); // удалит элемент
        }
    }
}
