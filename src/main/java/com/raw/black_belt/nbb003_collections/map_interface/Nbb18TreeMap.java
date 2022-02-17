package com.raw.black_belt.nbb003_collections.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class Nbb18TreeMap {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student student1 = new Student("noname", "nobody", 10);
        Student student2 = new Student("Mike", "Mouse", 3);
        Student student3 = new Student("Green", "hood", 2);
        Student student4 = new Student("Red", "Earl", 1);
        Student student5 = new Student("Ray-den", "Ea", 1);

        treeMap.put(1.2, student1);
        treeMap.put(3.2, student2);
        treeMap.put(4.2, student3);
        treeMap.put(5.2, student4);
        treeMap.put(1.2, student5);

        System.out.println(treeMap.descendingMap().tailMap(2.0));
        treeMap.lastEntry();
        treeMap.firstEntry();

        TreeMap<Student, Double> treeMap1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
