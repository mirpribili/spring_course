package com.raw.spring.n001_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class N3LifeCycleOfBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextN2VarietyOfBeanScope.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog Dog = context.getBean("myPet", Dog.class);
        Dog.say();

        context.close();
    }
}
