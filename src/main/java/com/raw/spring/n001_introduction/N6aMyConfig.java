package com.raw.spring.n001_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.raw.spring.n001_introduction")
public class N6aMyConfig {

    @Bean
    @Scope("singleton") // !!!
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        System.out.println("Person Bean created");
        return new Person(catBean()); // Where catBean() is DI.
    }
}
