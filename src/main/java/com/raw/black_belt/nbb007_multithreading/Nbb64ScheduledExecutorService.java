package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Nbb64ScheduledExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService
                = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i<10;  i++){
//            scheduledExecutorService.execute(
//                    new RunnableImpScheduledExecutorService()
//            );
//        }
        // отложим запуск
//        scheduledExecutorService.schedule(
//                new RunnableImpScheduledExecutorService(),
//                3,
//                TimeUnit.SECONDS);
        //
//        scheduledExecutorService.scheduleAtFixedRate(
//                new RunnableImpScheduledExecutorService(),
//                1,
//                1,
//                TimeUnit.SECONDS);
        // позволит обеспечить паузу между задачами - тк дождется завершения чтобы вставить паузу
        scheduledExecutorService.scheduleWithFixedDelay(
                new RunnableImpScheduledExecutorService(),
                1,
                1,
                TimeUnit.SECONDS
        );



        Thread.sleep(2000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}

class RunnableImpScheduledExecutorService implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " starts work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
