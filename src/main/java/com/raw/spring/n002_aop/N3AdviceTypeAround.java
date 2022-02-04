package com.raw.spring.n002_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class N3AdviceTypeAround {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        String bookName = universityLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу: " + bookName);


        context.close();
        System.out.println("Method main ends");
    }
}
