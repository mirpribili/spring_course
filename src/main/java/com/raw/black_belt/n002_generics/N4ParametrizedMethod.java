package com.raw.black_belt.n002_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class N4ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> a11 = new ArrayList<>();
        a11.add(1);
        a11.add(2);
        System.out.println(GenMethod.getSecondElement(a11));

        ArrayList<String> a12 = new ArrayList<>();
        a12.add("s1");
        a12.add("s2");
        System.out.println(GenMethod.getSecondElement(a12));
    }
}
class GenMethod{
    // Where:
    //      <T> - symbol "We used generic"
    //      T   - return type method
    public static <T> T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }
}