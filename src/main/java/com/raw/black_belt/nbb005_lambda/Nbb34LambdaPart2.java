package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Nbb34LambdaPart2 {
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

        Nbb32LambdaExpressionExample studentInfo = new Nbb32LambdaExpressionExample();
        System.out.println("- - - - - - - - - - - - - ");
        StudentChecks studentChecks = (Student s) -> {return s.age < 20 && s.avgGrade < 9  && s.sex == 'f';};
        studentInfo.testStudents(students, studentChecks);
        System.out.println("- - - - - - - - - - - - - ");
        studentInfo.testStudents(students, s -> s.age < 20 && s.course == 1);
        System.out.println("- - - - - - - - - - - - - ");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });
        Collections.sort(students, (s1, s2) -> s1.course-s2.course);


    }
}

