package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Nbb35RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("3000");
        strings.add("400");
        strings.add("20");
        strings.removeIf(element -> element.length() < 2);
        System.out.println(strings);
        Predicate<String> predicate1 = element -> element.length()<2;
        Predicate<String> predicate2 = element -> element.length()<3;
        strings.removeIf(predicate1);
        strings.removeIf(predicate1.and(predicate2));
        System.out.println(strings);
        strings.removeIf(predicate1.or(predicate2.negate()));
    }
}
