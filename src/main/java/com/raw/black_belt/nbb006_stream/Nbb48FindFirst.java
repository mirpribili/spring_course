package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nbb48FindFirst {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,98};
        int result = Arrays.stream(array).filter(value -> value>5).findFirst().getAsInt(); // get() for student class for example
        System.out.println(result);

        // min max
        int result_max = Arrays.stream(array).filter(value -> value>5).max().getAsInt();
        System.out.println(result_max);

        // min

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

        Student student_min = students.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(student_min);

        // limit ()
        List<Student> list = students.stream().filter(student -> student.getAge()>20).limit(1).collect(Collectors.toList());
        System.out.println(list);

        // skip()
        List<Student> list_skip = students.stream().filter(student -> student.getAge()>=20).skip(2).collect(Collectors.toList());
        System.out.println(list_skip);

    }
}
