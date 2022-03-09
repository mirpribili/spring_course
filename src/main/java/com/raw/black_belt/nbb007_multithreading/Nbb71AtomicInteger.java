package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Nbb71AtomicInteger {
//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);
    public synchronized static void increment(){
//        counter++;
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunableImplement());
        Thread thread2 = new Thread(new MyRunableImplement());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
class MyRunableImplement implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            Nbb71AtomicInteger.increment();
        }
    }
}
