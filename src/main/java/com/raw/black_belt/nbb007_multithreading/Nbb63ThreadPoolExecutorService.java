package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Nbb63ThreadPoolExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(5);
        for (int i = 0; i<10; i++){
            executors.execute(new RunnableImpExecutors());
        }
        executors.shutdown();
        executors.awaitTermination(5, TimeUnit.SECONDS);
    }
}
class RunnableImpExecutors implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}