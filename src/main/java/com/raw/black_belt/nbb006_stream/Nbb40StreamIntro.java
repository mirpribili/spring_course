package com.raw.black_belt.nbb006_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Nbb40StreamIntro {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Xena");
        list.add("Hercules");
        list.add("Sayuri");
        list.add("X3");
        list.add("Zarina");
        list.add("chili");
        // old method
//        for (int i = 0; i< list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);
        List<Integer> integerList = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        // after method map() we get:
        // [4, 8, 6, 2, 6, 5]
        System.out.println(integerList);


        int[] array = {5,5,6,7,8,1,12};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0){
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));


        Set<String> set = new TreeSet<>();
        set.add("Hi");
        set.add("PyramidHead");
        set.add("PinHead");
        set.add("LeatherFace");
        set.add("Freddy");
        System.out.println(set);

        List list1 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
