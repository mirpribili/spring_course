package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;
import java.util.List;

public class Nbb38ForEach {
    public static void main(String[] args) {
        String[] array = {"ok", "but", "bull", "many"};
        List<String> list = new ArrayList<>();
        for (String s:array){
//            System.out.println(s);
            list.add(s);
        }
        list.forEach(str -> System.out.println(str));


    }
}
