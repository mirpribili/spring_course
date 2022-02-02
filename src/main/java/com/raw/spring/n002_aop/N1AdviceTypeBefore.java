package com.raw.spring.n002_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class N1AdviceTypeBefore {
    public static void main(String[] args) {
        //
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        universityLibrary.getBook();
//        universityLibrary.getMagazine();
//        universityLibrary.returnBook();

        universityLibrary.getArticle("new article");

        Book book = context.getBean("book", Book.class);
//        System.out.println(book.getName());

        universityLibrary.getBookByName(book);

//        SchoolLibrary schoolLibraryLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibraryLibrary.getBook();

        context.close();
    }
}
