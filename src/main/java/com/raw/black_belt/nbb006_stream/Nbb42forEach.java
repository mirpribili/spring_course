package com.raw.black_belt.nbb006_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Nbb42forEach {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2,3,4,6,7,8);

        int[] array = {5,4,3,6,-11,4,8,45,0};
        Arrays.stream(array).forEach(value -> {
            value *=2;
            System.out.print(value + " ");
        });

        System.out.println();
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - ");
        integerStream.forEach(Utils::MyMethod);
    }
}
class Utils{
    public static void MyMethod(int a){
        a=a+5;
        System.out.print(a + " ");
    }
}