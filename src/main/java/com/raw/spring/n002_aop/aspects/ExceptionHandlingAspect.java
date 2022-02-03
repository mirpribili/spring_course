package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("com.raw.spring.n002_aop.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("[e] -> beforeGetExceptionHandlingAdvice: catching exceptions while we get a book or magazine");
    }
}
