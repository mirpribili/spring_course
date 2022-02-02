package com.raw.spring.n001_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class N6bConfigurationSpringContainerWithJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(N6aMyConfig.class);

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
