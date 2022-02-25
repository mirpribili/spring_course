package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Nbb43Reduce {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result =  list.stream().reduce(
                (accumulator, element) -> accumulator * element
                ).get();
        System.out.println(result);

        List<Integer> empty_list = new ArrayList<>();
        Optional<Integer> optionalInteger =
                empty_list.stream().reduce(
                        (accumulator, element) -> accumulator * element);
        if (optionalInteger.isPresent()){
            System.out.println(optionalInteger.get());
        }


        int result_from_empty =  empty_list.stream().reduce(1,
                (accumulator, element) -> accumulator * element
        );
    }
}
