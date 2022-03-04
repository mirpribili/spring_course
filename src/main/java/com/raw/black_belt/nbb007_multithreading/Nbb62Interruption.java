package com.raw.black_belt.nbb007_multithreading;

public class Nbb62Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(1000);
//        thread.stop();
        thread.interrupt();
        thread.join();
        System.out.println("main ends");
    }
}
class InterruptedThread extends Thread{
    double sqrtSum = 0;
    public void run(){
        for (int i = 1; i<= 1_000_000_000;i++){
            if(isInterrupted()){
                System.out.println("thread someone want interrupt...");
                return;
            }
            sqrtSum+=Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("InterruptedException while thread sleeps");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}