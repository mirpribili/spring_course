package com.raw.spring.n002_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class N2AdviceAfterReturning {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);
        // А теперь поменяем массив студентов на фрукты? О_о


        context.close();
    }
}
