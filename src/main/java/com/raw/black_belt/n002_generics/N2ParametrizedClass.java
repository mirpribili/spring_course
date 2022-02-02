package com.raw.black_belt.n002_generics;

public class N2ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hi!");
//        System.out.println(info1);
//
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(88);
//        System.out.println(info2);
//        Integer i = info2.getValue();
    }

    //---------------------------
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
    public void abc(Info<Integer> info){
        Integer i = info.getValue();
    }
    // Увы для JVM оба метода будут выглядеть одинаково --> abc(Info info)
    // Такая проблема создания overload methods
    //---------------------------
}
class Info <T>{ // T - type placeholder
    private T value;
    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}
//--------------------------------
class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}
//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}
// Увы для JVM оба метода будут выглядеть одинаково --> abc(Info info)
//--------------------------------