package com.raw.black_belt.nbb003_collections.map_interface;

import java.util.Hashtable;

public class Nbb20HashTable {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable1 =
                new Hashtable<>();
        Student student1 = new Student("noname", "nobody", 10);
        Student student2 = new Student("Mike", "Mouse", 3);
        Student student3 = new Student("Green", "hood", 2);
        Student student4 = new Student("Red", "Earl", 1);
        Student student5 = new Student("Ray-den", "Ea", 1);

        hashtable1.put(1.2, student1);
        hashtable1.put(3.2, student2);
        hashtable1.put(4.2, student3);
        hashtable1.put(5.2, student4);
        hashtable1.put(1.2, student5);

        System.out.println(hashtable1);
    }
}
