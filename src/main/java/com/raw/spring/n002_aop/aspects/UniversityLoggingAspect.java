package com.raw.spring.n002_aop.aspects;

import com.raw.spring.n002_aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("[b] -> beforeGetStudents. We are logging getting list of students BEFORE method getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(
//            //JoinPoint joinPoint,
//            List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        firstStudent.setAvgGrade(avgGrade + 10);
//
//        System.out.println("[a] -> afterReturningGetStudentsLoggingAdvice. We are logging getting list of students AFTER method getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("[t] -> afterThrowingGetStudentsLoggingAdvice: Logging throwing exception" + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("[a] -> afterGetStudentsLoggingAdvice: Logging a normal shutdown method or an exception");
    }
}
