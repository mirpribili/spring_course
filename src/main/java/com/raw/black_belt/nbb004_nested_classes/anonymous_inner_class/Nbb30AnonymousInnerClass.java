package com.raw.black_belt.nbb004_nested_classes.anonymous_inner_class;

public class Nbb30AnonymousInnerClass {
    public static void main(String[] args) {
        MyMatch m = new MyMatch() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(1,955));
    }
}
interface MyMatch{
    int doOperation(int a, int b);
}
