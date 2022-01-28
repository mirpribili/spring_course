package com.raw.spring.n001_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class N1DependencyInjection1 {
    public static void main(String[] args) {
        // old way
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);

        // old way add dependency (Hardcode dependency)
//        Person person = new Person(pet);

        // another old xml way
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        //
        context.close();
    }
}
