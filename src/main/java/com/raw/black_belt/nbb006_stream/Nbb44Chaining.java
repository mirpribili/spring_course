package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nbb44Chaining {
    public static void main(String[] args) {
        int[] array = {1,34,5,1,7,23,8,65,1,856,23,46,8734,312,-11};
        int resault = Arrays.stream(array)
                .filter(e->e%2==1)
                .map(e -> { if(e%3==0){e=e/3;}return e;})
                .reduce((a,e)->a+e)
                .getAsInt();
        System.out.println(resault);

        Student student1 = new Student("Ivan",'m', 22, 3, 8.3);
        Student student2 = new Student("Nikola",'m', 20, 4, 6.3);
        Student student3 = new Student("Mikola",'m', 24, 5, 9.3);
        Student student4 = new Student("Dafina",'f', 19,1, 9.3);
        Student student5 = new Student("Dafny",'f', 19,2, 5.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.stream().map(e ->
            {
                e.setName(e.getName().toUpperCase());
                return e;
            })
                .filter(e -> e.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(e -> System.out.println(e));

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3,4);
        stream1.filter(e -> {
            System.out.println("!!!");
            return e%2==0;
        });//.collect(Collectors.toList());
    }
}
