package com.raw.black_belt.nbb007_multithreading;

public class Nbb52ThreadNameAndPriority {
    public static void main(String[] args) {
        MyThreadNameAndPriority myThread5 = new MyThreadNameAndPriority();
        System.out.println(myThread5.getName());

        MyThreadNameAndPriority myThread6 = new MyThreadNameAndPriority();
        System.out.println(myThread6.getName() + " " + myThread6.getPriority());
        myThread6.setPriority(Thread.MAX_PRIORITY);

        System.out.println("----------------------");
        Thread thread = new Thread(new MyThreadNameAndPriority());
        thread.start();
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }
}
class MyThreadNameAndPriority extends Thread{
    public void run(){
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }
}
