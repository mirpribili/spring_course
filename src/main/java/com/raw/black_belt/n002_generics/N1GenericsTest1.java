package com.raw.black_belt.n002_generics;

import java.util.ArrayList;
import java.util.List;

public class N1GenericsTest1 {
    public static void main(String[] args) {
//        List list = new ArrayList<>(); // raw type (NOT USE!)
        List<String> list = new ArrayList<>();
        // <> - diamond

//        list.add("String");
//        list.add(5);
//        list.add(new StringBuilder("stringBuilder"));
//        list.add(new Car());

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        for(Object o: list){
            System.out.println(o + " length: " + ((String)o).length());
        }
    }
}
class Car{}
