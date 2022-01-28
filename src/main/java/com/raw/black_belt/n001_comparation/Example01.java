package com.raw.black_belt.n001_comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Example01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zena");
        list.add("Ivan");
        list.add("Mariya");
        System.out.println("Before sort");
        System.out.println(list);
        Collections.sort(list); // nature order
        System.out.println("After sort");
        System.out.println(list);
    }
}
