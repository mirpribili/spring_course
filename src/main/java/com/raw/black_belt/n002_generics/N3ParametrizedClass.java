package com.raw.black_belt.n002_generics;

public class N3ParametrizedClass {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("String", 88);
        System.out.println("value 1: " + pair.getFirstValue() + "; value 2: " + pair.getSecondValue());
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }
}

class OtherPair<V>{ // only one placeholder for 2 value
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue(){
        return value1;
    }
    public V getSecondValue(){
        return value2;
    }
}