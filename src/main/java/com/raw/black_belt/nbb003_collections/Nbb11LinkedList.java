package com.raw.black_belt.nbb003_collections;

import java.util.LinkedList;

public class Nbb11LinkedList {
    public static void main(String[] args) {
        StudentLinkedList student1 = new StudentLinkedList("Ivan", 1);
        StudentLinkedList student2 = new StudentLinkedList("Van-Dam", 2);
        StudentLinkedList student3 = new StudentLinkedList("Rubik", 3);
        StudentLinkedList student4 = new StudentLinkedList("Cubic", 4);
        StudentLinkedList student5 = new StudentLinkedList("Vlada", 5);

        LinkedList<StudentLinkedList> studentLinkedLists =
                new LinkedList<>();
        studentLinkedLists.add(student1);
        studentLinkedLists.add(student2);
        studentLinkedLists.add(student3);
        studentLinkedLists.add(student4);
        studentLinkedLists.add(student5);

        System.out.println(studentLinkedLists);

    }
}
class StudentLinkedList{
    String name;
    int course;

    public StudentLinkedList(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentLinkedList{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}