package com.raw.spring.n001_introduction;

public class Person {
    private Pet pet;
//
//    public Person(Pet pet){
//        System.out.println("Person is created");
//        this.pet = pet;
//    }


    public Person(){
        System.out.println("Person is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet"); // add pet
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
