package com.raw.black_belt.nbb005_lambda;

public class Nbb33LambdaExampleTwo {
    public static void main(String[] args) {
        def((String s) -> {return s.length();});
    }
    static void def(I i){
        System.out.println(i.abc("Hi"));
    }
}
interface  I{
    int abc(String s);
}
