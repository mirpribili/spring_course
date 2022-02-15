package com.raw.black_belt.n002_generics;

import java.util.ArrayList;
import java.util.List;

public class Na4Wildcards {
    public static void main(String[] args) {
// Na4Wildcards

//        List<Number> list = new ArrayList<Integer>(); // error
//        List<Object> list = new ArrayList<Integer>(); // error
        List<Integer> list2 = new ArrayList<>(); // ok
        list2.add(2);
        showListIngo(list2);

        // ? --> in generics любой класс

// Bounded wildcards
        List<?> list = new ArrayList<Integer>(); // ok
        List<? super Number> listNumb = new ArrayList<Object>(); // ok

        List<? extends Number> listExNumber = new ArrayList<>();

        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(12.3);
        listDouble.add(145.3);

        System.out.println(summ(listDouble));

    }
    static void showListIngo(List<?> list){
        System.out.println("List -->" + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList1){
        double sum = 0;
        for (Number n : arrayList1){
            sum += n.doubleValue();
        }
        return sum;
    }
}
