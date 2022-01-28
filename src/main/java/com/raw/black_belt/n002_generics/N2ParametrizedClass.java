package com.raw.black_belt.n002_generics;

public class N2ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hi!");
        System.out.println(info1);

        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(88);
        System.out.println(info2);
        Integer i = info2.getValue();
    }

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
