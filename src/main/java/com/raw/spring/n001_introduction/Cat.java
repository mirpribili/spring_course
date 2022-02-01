package com.raw.spring.n001_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
