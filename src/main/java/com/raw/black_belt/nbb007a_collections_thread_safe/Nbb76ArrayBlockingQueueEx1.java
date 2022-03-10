package com.raw.black_belt.nbb007a_collections_thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class Nbb76ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue =
                new ArrayBlockingQueue<>(4);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue);
//        queue.offer(5);
//
//
        new Thread(() -> {
            int i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Producer add: " + i + " -> " + queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            int i = 0;
            while (true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer take: " + j + " -> " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
