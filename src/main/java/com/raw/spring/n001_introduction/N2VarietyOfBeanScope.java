package com.raw.spring.n001_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class N2VarietyOfBeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextN2VarietyOfBeanScope.xml");
                        //, "applicationContext.xml");
        // давайте проверим утверждение
        ///  - является общим для всех, кто запросит его у Spring Container-а;
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("myDog");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("yourDog");
        // будет ли это двумя ссылками на 1 объект

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();

    }
}
