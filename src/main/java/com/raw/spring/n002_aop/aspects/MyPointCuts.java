package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){} // private change to public for get ought from class MyPointCuts
}
