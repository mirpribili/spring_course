package com.raw.spring.n001_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class N4ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConfigurationWithAnnotation.xml");
//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        Person person =  context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}