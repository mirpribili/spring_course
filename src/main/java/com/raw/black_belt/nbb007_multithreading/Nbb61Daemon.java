package com.raw.black_belt.nbb007_multithreading;

public class Nbb61Daemon {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }

}
class  UserThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is daemon " + isDaemon());
        for (char i = 'A'; i<='J'; i++){
            try {
                sleep(200);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is daemon " + isDaemon());
        for (int i = 1; i<=1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
