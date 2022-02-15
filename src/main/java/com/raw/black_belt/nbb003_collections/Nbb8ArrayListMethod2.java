package com.raw.black_belt.nbb003_collections;

import java.util.ArrayList;
import java.util.Objects;

public class Nbb8ArrayListMethod2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm',22,3,8.5);
        Student student1del = new Student("Ivan", 'm',22,3,8.5);
        Student student2 = new Student("Nikola", 'm',23,2,4.5);
        Student student3 = new Student("Mikola", 'm',18,1,1.5);
        Student student4 = new Student("Mary", 'f',29,4,9.5);
        Student student5 = new Student("Elena", 'f',35,3,7.15);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        studentArrayList.remove(student1del);
        // !!! БЕЗ ПЕРЕРОПРЕДЕЛЕНИЯ метода equal
        // удаление не произойдет

        System.out.println(studentArrayList);

    }
}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}