package com.raw.spring.n001_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // for XML method
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class); // But not Dog.class !!! in order not to have to recompile
        pet.say();
        context.close();
    }
}
