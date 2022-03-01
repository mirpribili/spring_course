package com.raw.black_belt.nbb007_multithreading;

public class Nbb53SleepAndJoin {
    public static void testSleep() throws InterruptedException {
        for(int i = 5; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Start");
    }
    public static void main(String[] args) throws InterruptedException {
       //testSleep();
        Thread thread1 = new Thread((new MyRunnable1()));
        Thread thread2 = new MyRunnable2();

        thread1.start();
        System.out.println("thread1 state: " + thread1.getState());
        thread2.start();
        System.out.println("thread1 state: " + thread1.getState());

        thread1.join();
        //thread2.join();
        System.out.println("thread1 state: " + thread1.getState());

        System.out.println("end");
        /*
            Thread-1 8
            Thread-0 9
            end
            Thread-1 9
         */
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        for (int i = 1; i < 10; i++){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
class MyRunnable2 extends Thread{
    public void run(){
        for (int i = 1; i < 10; i++){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}