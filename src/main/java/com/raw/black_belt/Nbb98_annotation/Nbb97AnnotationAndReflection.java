package com.raw.black_belt.Nbb98_annotation;

import java.lang.annotation.*;

public class Nbb97AnnotationAndReflection {
    public static void main(String[] args) throws
            ClassNotFoundException {
        Class xiaomiClass = Class.forName("com.raw.black_belt.Nbb98_annotation.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println(sm1.OS() + " " + sm1.earOfCompanyCreation());
    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int earOfCompanyCreation();
}
@SmartPhone(earOfCompanyCreation = 2020)
class Xiaomi{
    String model;
    double price;
}
@SmartPhone(OS = "IOS", earOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}