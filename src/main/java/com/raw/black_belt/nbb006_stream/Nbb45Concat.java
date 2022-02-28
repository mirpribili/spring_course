package com.raw.black_belt.nbb006_stream;

import java.util.stream.Stream;

public class Nbb45Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3,4);
        stream1.filter(e -> {
            System.out.println("!!!");
            return e%2==0;
        });//.collect(Collectors.toList());

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        stream4.forEach(System.out::println);

    }
}
