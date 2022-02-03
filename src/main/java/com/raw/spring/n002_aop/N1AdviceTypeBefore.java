package com.raw.spring.n002_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class N1AdviceTypeBefore {
    public static void main(String[] args) {
        //
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        universityLibrary.getBook();
        universityLibrary.getMagazine();

        Book book = context.getBean("book", Book.class);
        System.out.println(book.getName());

        universityLibrary.addBook("book", book);
        universityLibrary.addMagazine();


//        universityLibrary.addBook("Les Miserables");
//        universityLibrary.returnMagazine();

//        universityLibrary.returnBook();

//        universityLibrary.getArticle("new article");


//        universityLibrary.getBookByName(book);

//        SchoolLibrary schoolLibraryLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibraryLibrary.getBook();

        context.close();
    }
}
