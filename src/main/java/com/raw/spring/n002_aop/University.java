package com.raw.spring.n002_aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Evan McMillian", 4, 7.5);
        Student student2 = new Student("Philip Ojomo", 4, 5.5);
        Student student3 = new Student("Max and Evelyn Thompson", 4, 2.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    public List<Student> getStudents(){
        System.out.println("Start work method getStudents");
        System.out.println("Information from method getStudents: ");
//        System.out.println(students.get(3));
        System.out.println(students);
        return students;
    }
}
