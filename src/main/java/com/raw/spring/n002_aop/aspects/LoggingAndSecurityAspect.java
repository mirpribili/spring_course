package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect // не простой класс, отвечающий за сквозную функциональность.
public class LoggingAndSecurityAspect {
    // ЗАДАЧА: создать такой pointcut который подойдет для
    //       getBook,getBookByName,returnBook,addBook,getArticle,getMagazine,addMagazine
    // Но не для: returnMagazine
    @Pointcut("execution(* com.raw.spring.n002_aop.UniversityLibrary.*(..))")
    private void allMethodsFromUniversityLibrary(){}

    @Pointcut("execution(public void com.raw.spring.n002_aop.UniversityLibrary.returnMagazine())")
    private void returnMagazineFromUniversityLibrary(){}

    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("[l] -> beforeAllMethodsExceptReturnMagazineAdvice: writing Log #4");
    }
//----------------------------------------------------------------------------------------------------
//    @Pointcut("execution(* com.raw.spring.n002_aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniversityLibrary(){}
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("[l] -> beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Pointcut("execution(* com.raw.spring.n002_aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniversityLibrary(){}
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("[l] -> beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    // ЗАДАЧА: добавить сквозную логику и для всех get и return методов
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()")
//    private void allGetAndReturnMethodsFromUniversityLibrary(){}
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("[l] -> beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//----------------------------------------------------------------------------------------------------


//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
////    @Before("execution(public void com.raw.spring.n002_aop.UniversityLibrary.getBook())")
////    @Before("execution(public void get* (com.raw.spring.n002_aop.Book))")
//
//    @Before("allGetMethods()")//===    @Before("execution(* get*())")
//    public void beforeGetBookAdvice(){
//        System.out.println("+ -> beforeGetBookAdvice: trying to get the book or magazine");
//    }
//
//    @Before("allGetMethods()")//===    @Before("execution(* get*())")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("[*] -> beforeGetSecurityAdvice. Checking the rights to receive the book or magazine");
//    }


//    @Before("execution(public void return* ())")
//    @Before("execution(public * return* ())")
//    @Before("execution( * return* ())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("- -> beforeReturnBookAdvice: trying to return a book");
//    }

//    @Before("execution(public void getArticle(String))")
//    @Before("execution(public void getArticle(..))")
//    public void beforeGetArticleAdvice(){
//        System.out.println("+ -> beforeGetArticleAdvice: trying to get an article");
//    }
}
