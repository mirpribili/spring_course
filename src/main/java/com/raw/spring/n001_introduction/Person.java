package com.raw.spring.n001_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
