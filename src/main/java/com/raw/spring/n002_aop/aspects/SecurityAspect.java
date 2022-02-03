package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.raw.spring.n002_aop.aspects.MyPointCuts.allGetMethods()")//===    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice(){
        System.out.println("[*] -> beforeGetSecurityAdvice. Checking the rights to receive the book or magazine");
    }
}
