package com.raw.black_belt.nbb003_collections.set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Nbb22TreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(51);
        treeSet.add(15);
        treeSet.add(511);
        treeSet.add(115);

        treeSet.remove(511);
        System.out.println(treeSet.contains(115));

        TreeSet<Student> treeSetStudent =
                new TreeSet<>();
        Student  student1 = new Student("Zend", 5);
        Student  student2 = new Student("Zelda", 1);
        Student  student3 = new Student("Zero", 4);
        Student  student4 = new Student("Zerk", 2);

        treeSetStudent.add(student1);
        treeSetStudent.add(student2);
        treeSetStudent.add(student3);
        treeSetStudent.add(student4);
        System.out.println(treeSetStudent);

        Student  student5 = new Student("Enot", 4);
        Student  student6 = new Student("Hot", 5);
        System.out.println(treeSetStudent.headSet(student5));
        System.out.println(treeSetStudent.subSet(student5, student6));

        System.out.println(student1.equals(student6));
    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student another) {
        return this.course - another.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
