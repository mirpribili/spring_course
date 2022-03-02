package com.raw.black_belt.nbb007_multithreading;

public class Nbb54Volatile extends Thread{
    volatile boolean b = true;

    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("loop is finished. Counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        Nbb54Volatile thread = new Nbb54Volatile();
        thread.start();
        Thread.sleep(3000); // main
        System.out.println("after 3 seconds it time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("end of program");
    }
}
