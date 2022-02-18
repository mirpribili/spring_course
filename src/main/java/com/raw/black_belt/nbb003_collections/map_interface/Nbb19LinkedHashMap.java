package com.raw.black_belt.nbb003_collections.map_interface;

import java.util.LinkedHashMap;

public class Nbb19LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap1 =
                new LinkedHashMap<>(16, 0.75f, false);

        Student student1 = new Student("noname", "nobody", 10);
        Student student2 = new Student("Mike", "Mouse", 3);
        Student student3 = new Student("Green", "hood", 2);
        Student student4 = new Student("Red", "Earl", 1);
        Student student5 = new Student("Ray-den", "Ea", 1);

        linkedHashMap1.put(1.2, student1);
        linkedHashMap1.put(3.2, student2);
        linkedHashMap1.put(4.2, student3);
        linkedHashMap1.put(5.2, student4);
        linkedHashMap1.put(1.2, student5);

        System.out.println(linkedHashMap1);
    }
}
