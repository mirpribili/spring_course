package com.raw.spring.n001_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
//    @Value("Smith")
    @Value("${person.surname}")
    private String surname;
//    @Value("34") // But This is hardcode variant
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(/*@Qualifier("dog") */Pet pet){
        System.out.println("Person is created");
        this.pet = pet;
    }


    public Person(){
        System.out.println("Person is created");
    }
//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet"); // add pet
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person, setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person, setAge");
        this.age = age;
    }
}
