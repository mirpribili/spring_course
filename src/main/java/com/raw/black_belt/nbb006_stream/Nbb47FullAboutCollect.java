package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Nbb47FullAboutCollect {
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

        Map<Integer, List<Student>> listStudents = students.stream().map(e->{e.setName(e.getName().toUpperCase());
        return e;}).collect(Collectors.groupingBy(e->e.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry : listStudents.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


        Map<Boolean, List<Student>> listStudents2 =
        students.stream().collect(Collectors.partitioningBy(student -> student.getAvgGrade()>6));
        for (Map.Entry<Boolean, List<Student>> entry : listStudents2.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
