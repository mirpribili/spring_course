package com.raw.black_belt.nbb007_multithreading;

public class Nbb58WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}
class Market{
    private int breadCount = 0;
    public synchronized void getBread(){
        while (breadCount<1){
            try {
                wait(); // for synchronized (lock){ lock.notify() and lock.wait()}
            } catch (InterruptedException e) {
            }
        }
        breadCount--;
        System.out.print("Потребитель купил 1 хлеб                ");
        System.out.println("-- Bread count = " + breadCount);
        notify();
    }
    public synchronized void putBread(){
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.print("Производитель добавил на прилавок 1 хлеб");
        System.out.println("-- Bread count = " + breadCount);
        notify();
    }
}
class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            market.putBread();
        }
    }
}
class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            market.getBread();
        }
    }
}

