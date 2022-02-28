package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.List;

public class Nbb50ParallelStream {
    public static void main(String[] args) {
        List<Double> list_double = new ArrayList<>();
        list_double.add(10.0);
        list_double.add(5.0);
        list_double.add(1.0);
        list_double.add(0.25);

        double division = list_double.parallelStream()//.stream()
                .reduce((aDouble, aDouble2) -> aDouble/aDouble2).get();
        System.out.println(division); // 8 != 0.5

    }
}
