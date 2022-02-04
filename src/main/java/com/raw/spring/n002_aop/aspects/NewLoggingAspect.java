package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
//    public void aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint){

// Because
    // public String returnBook(){
//    public String aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)

// Because
    // Object targetMethodResult = proceedingJoinPoint.proceed();
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        // proceedingJoinPoint -> наша связь с target method
        System.out.println("[ar]-> aroundReturnBookLoggingAdvice. In the library trying to return a book");

        Long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        Long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");

        targetMethodResult = "Hacked with @Around";

        System.out.println("[ar]-> aroundReturnBookLoggingAdvice. In library returned the book");
        return targetMethodResult;
    }
}
