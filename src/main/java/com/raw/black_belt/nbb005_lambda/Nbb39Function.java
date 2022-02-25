package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Nbb39Function {
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
        // задача вернуть среднее арифметическое по произвольным полям студентов
        Function<Student, Double> function = student -> student.avgGrade;
        double result = avgOfSmth(students, function);
        System.out.println(result);
        System.out.println("average age: " + avgOfSmth(students, student -> (double)student.age));
    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> function){
        double result = 0;
        for (Student student: list){
            result+=function.apply(student);
        }
        return result/list.size();
    }
}
