package com.raw.black_belt.nbb006_stream;

import java.util.ArrayList;
import java.util.List;

public class Nbb46FlatMap {
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

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied mathematics");
        faculty1.addStudentOnFaculty(student1);
        faculty1.addStudentOnFaculty(student2);
        faculty1.addStudentOnFaculty(student3);
        faculty2.addStudentOnFaculty(student4);
        faculty2.addStudentOnFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream())
                .forEach(e-> System.out.println(((Student) e).getName()));




    }
}
class Faculty{
    String name;
    List<Student> studentOnFaculty;
    public Faculty(String name){
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }
    public List<Student> getStudentOnFaculty(){
        return this.studentOnFaculty;
    }
    public void addStudentOnFaculty(Student student){
        studentOnFaculty.add(student);
    }
}
