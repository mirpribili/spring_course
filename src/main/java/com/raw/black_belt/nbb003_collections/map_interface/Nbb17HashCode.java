package com.raw.black_belt.nbb003_collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Nbb17HashCode {
    public static void main(String[] args) {
        Map<Student, Double> studentMap = new HashMap<>();
        Student student1 = new Student("noname", "nobody", 10);
        Student student2 = new Student("Mike", "Mouse", 3);
        Student student3 = new Student("Green", "hood", 2);
        Student student4 = new Student("Red", "Earl", 1);

        studentMap.put(student1, 7.5);
        studentMap.put(student2, 8.5);
        studentMap.put(student3, 2.5);
        studentMap.put(student4, 5.5);

        System.out.println(studentMap);

        Student student5 = new Student("Red", "Earl", 1);

        System.out.println(studentMap.containsKey(student5));
    }
}
class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}