package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.CountDownLatch;

public class Nbb69CountDownLatch {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffIsOnPlace() throws InterruptedException{
        Thread.sleep(1200); // 12 hours free time of staff
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println(" countDownLatch: " + countDownLatch.getCount());
    }
    private static void everythingIsReady() throws InterruptedException{
        Thread.sleep(1000); // 1 hours for prepare to open the market
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println(" countDownLatch: " + countDownLatch.getCount());
    }
    private static void openMarket() throws InterruptedException{
        Thread.sleep(800); // 8 hours market is opened
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println(" countDownLatch: " + countDownLatch.getCount());
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Xena 1", countDownLatch);
        new Friend("Xena 2", countDownLatch);
        new Friend("Xena 3", countDownLatch);
        new Friend("Xena 4", countDownLatch);
        new Friend("Xena 5", countDownLatch);
        new Friend("Xena 6", countDownLatch);
        new Friend("Xena 7", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}
class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    public Friend(String name, CountDownLatch countDownLatch){
        this.name=name;
        this.countDownLatch=countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}