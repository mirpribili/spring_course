package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.Semaphore;

public class Nbb68Semaphore {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Xena", callBox);
        new Person("Habitual", callBox);
        new Person("Habitual2", callBox);
        new Person("Habitual3", callBox);
        new Person("Habitual4", callBox);
        new Person("Habitual5", callBox);
    }
}
class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + "is waiting ...");
        try {
            callBox.acquire();
            System.out.println(name + " is calling");
            sleep(2000);
            System.out.println(name + " completed the call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            callBox.release();
        }
    }
}
