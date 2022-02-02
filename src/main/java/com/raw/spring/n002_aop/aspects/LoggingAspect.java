package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // не простой класс, отвечающий за сквозную функциональность.
public class LoggingAspect {

//    @Before("execution(public void com.raw.spring.n002_aop.UniversityLibrary.getBook())")
    @Before("execution(public void get* (com.raw.spring.n002_aop.Book))")
    public void beforeGetBookAdvice(){
        System.out.println("+ -> beforeGetBookAdvice: trying to get a book");
    }

//    @Before("execution(public void return* ())")
//    @Before("execution(public * return* ())")
    @Before("execution( * return* ())")
    public void beforeReturnBookAdvice(){
        System.out.println("- -> beforeReturnBookAdvice: trying to return a book");
    }

//    @Before("execution(public void getArticle(String))")
    @Before("execution(public void getArticle(..))")
    public void beforeGetArticleAdvice(){
        System.out.println("+ -> beforeGetArticleAdvice: trying to get an article");
    }
}
