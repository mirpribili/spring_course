package com.raw.black_belt.nbb007_multithreading;

public class Nbb59DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread_deadlock_1 thread_deadlock_1 = new Thread_deadlock_1();
        Thread_deadlock_2 thread_deadlock_2 = new Thread_deadlock_2();
        thread_deadlock_1.start();
        thread_deadlock_2.start();
    }
}
class Thread_deadlock_1 extends Thread{
    public void run(){
        System.out.println("Thread: try catch monitor of lock1" );
        synchronized (Nbb59DeadLock.lock1){
            System.out.println("Thread: caught monitor of lock1" );
            System.out.println("Thread: try catch monitor of lock2" );
            synchronized (Nbb59DeadLock.lock2){
                System.out.println("Thread: caught monitor of lock1 and lock2" );
            }
        }
    }
}
class Thread_deadlock_2 extends Thread{
    public void run(){
        System.out.println("Thread2: try catch monitor of lock2" );
        synchronized (Nbb59DeadLock.lock2){
            System.out.println("Thread2: caught monitor of lock2" );
            System.out.println("Thread2: try catch monitor of lock1" );
            synchronized (Nbb59DeadLock.lock1){
                System.out.println("Thread2: caught monitor of lock1 and lock2" );
            }
        }
    }
}

