package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nbb49MapToInt {
    public static void main(String[] args) {
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

        List<Integer> integerList = students
                .stream()
                .mapToInt(value -> value.getAge())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
