package com.raw.black_belt.nbb003_collections;

import java.util.Arrays;
import java.util.List;

public class Nbb9ArrayListMetho3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        StringBuilder stringBuilder4 = new StringBuilder("D");
        StringBuilder stringBuilder5 = new StringBuilder("E");
        StringBuilder stringBuilder6 = new StringBuilder("F");
        StringBuilder [] stringBuilders =
                {stringBuilder1, stringBuilder2, stringBuilder3,
                        stringBuilder4, stringBuilder5, stringBuilder6};
        List<StringBuilder> list = Arrays.asList(stringBuilders);
        System.out.println(list);

        stringBuilders[0].append("!!!");
        System.out.println(list);

        StringBuilder [] stringBuilders1 = {stringBuilder1};


//        List<Integer> list1 = List.of(3, 14, 8);
    }
}
