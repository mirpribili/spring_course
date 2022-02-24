package com.raw.black_belt.nbb005_lambda;

import java.util.ArrayList;

public class Nbb31LambdaExpression {
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

        Nbb31LambdaExpression studentInfo = new Nbb31LambdaExpression();
        studentInfo.testStudents(students, new CheckOverGrade());

    }

    void testStudents(ArrayList<Student> students1, StudentChecks studentChecks){
        for (Student s: students1){
            if(studentChecks.check(s)){
                System.out.println(s);
            }
        }
    }



}
interface StudentChecks{
    boolean check(Student student);
}

// ДАВАЙТЕ ЗАМЕНИМ ЭТОТ КЛАС АНОНИМНЫМ!! ТОГДА НЕ НАДО БУДЕТ ПЛОДИТЬ ЕГО РЕАЛИЗАЦИИ
class CheckOverGrade implements StudentChecks{

    @Override
    public boolean check(Student student) {
        return student.avgGrade > 8;
    }
}