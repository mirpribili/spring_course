package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;

public class StudentInfo {
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

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentMixCondition(students, 21, 6, 'm');
        System.out.println("-----------------------");
        studentInfo.printStudentsOverGrade(students, 5);
        System.out.println("-----------------------");
        studentInfo.printStudentsUnderAge(students, 19);
    }
    void printStudentsOverGrade(ArrayList<Student> students, double grade){
        for (Student s: students){
            if(s.avgGrade > grade){
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> students, int age){
        for (Student s: students){
            if(s.age < age){
                System.out.println(s);
            }
        }
    }
    void printStudentMixCondition(ArrayList<Student> students,int age, double grade, char sex){
        for (Student s: students){
            if(s.age > age && s.avgGrade > grade  && s.sex == sex){
                System.out.println(s);
            }
        }
    }
}
