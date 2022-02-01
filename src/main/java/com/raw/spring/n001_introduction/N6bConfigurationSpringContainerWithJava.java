package com.raw.spring.n001_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class N6bConfigurationSpringContainerWithJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(N6aMyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
