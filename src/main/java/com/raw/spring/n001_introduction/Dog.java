package com.raw.spring.n001_introduction;

public class Dog  implements Pet{
    public Dog() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
