package com.raw.spring.n001_introduction;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        // But we can change animal without recompiling.
        // Config file will help us with this. Like as Spring Framework.


        pet = new Cat();
        pet.say();
    }
}
