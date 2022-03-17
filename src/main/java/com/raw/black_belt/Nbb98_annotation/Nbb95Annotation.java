package com.raw.black_belt.Nbb98_annotation;

public class Nbb95Annotation {
    public static void main(String[] args) {
        Child child = new Child("Pups");
        child.showInfo();
    }
}
class Parent{
    String name;
    public Parent(String name){
        this.name = name;
    }
    @Deprecated
    void showInfo(){
        System.out.println("It's Parent class. Name = " + name);
    }
}
class Child extends Parent{
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("It's Child class. Name = " + name);
    }
}
