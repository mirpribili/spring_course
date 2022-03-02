package com.raw.black_belt.nbb007_multithreading;

public class Nbb56Monitor {
    public static void main(String[] args) {
        MyRunnableImpl2 runnableImpl1 = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnableImpl1);
        Thread thread2 = new Thread(runnableImpl1);
        Thread thread3 = new Thread(runnableImpl1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter2{
    static int count = 0;
}
class MyRunnableImpl2 implements Runnable{
    Object monitor;

    public static void /*synchronized*/ howSynchronizedStaticMethod(){
        /* Or */
        synchronized (MyRunnableImpl2.class) {
            Counter2.count++;
        }
    }

    private  /*synchronized*/ void  increment(){ /// !!!!!!!!!!!!!!
        synchronized (this) {
            Counter2.count++;
            System.out.print(Counter2.count + " ");
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            increment();
        }
    }
}