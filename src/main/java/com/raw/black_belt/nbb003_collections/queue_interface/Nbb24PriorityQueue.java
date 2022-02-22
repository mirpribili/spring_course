package com.raw.black_belt.nbb003_collections.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class Nbb24PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueueInt = new PriorityQueue<>();
        priorityQueueInt.add(1111);
        priorityQueueInt.add(1);
        priorityQueueInt.add(111);
        priorityQueueInt.add(1111);
        priorityQueueInt.add(11);

        System.out.println(priorityQueueInt);
        System.out.println(priorityQueueInt.remove());

        Student student1 = new Student("Zend", 5);
        Student student2 = new Student("Zelda", 1);
        Student student3 = new Student("Zero", 4);
        Student student4 = new Student("Zerk", 2);
        PriorityQueue<Student> priorityQueueStudent =
                new PriorityQueue<>();
        priorityQueueStudent.add(student1);
        priorityQueueStudent.add(student2);
        priorityQueueStudent.add(student3);
        priorityQueueStudent.add(student4);

        System.out.println(priorityQueueStudent);

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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
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
        return Objects.hash(name, course);
    }
}

