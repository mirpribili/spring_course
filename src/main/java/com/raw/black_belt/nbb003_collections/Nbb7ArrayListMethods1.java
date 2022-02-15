package com.raw.black_belt.nbb003_collections;

import java.util.ArrayList;

public class Nbb7ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Mary");
        arrayList1.add("Zaur2");
        System.out.println(arrayList1);
        for (String s: arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();

        for (int i = 0; i< arrayList1.size(); i++){
            System.out.print(arrayList1.get(i) + " ");
        }
    }
}
