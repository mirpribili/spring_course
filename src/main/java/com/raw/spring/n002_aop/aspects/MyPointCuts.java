package com.raw.spring.n002_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){} // private change to public for get ought from class MyPointCuts
}
