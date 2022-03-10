package com.raw.black_belt.nbb007a_collections_thread_safe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Nbb74ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
//        HashMap<Integer, String> map = new HashMap<>();
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Xena");
        map.put(2, "Rock");
        map.put(3, "Stone");
        map.put(4, "Terran");
        map.put(5, "Protos");
        map.put(6, "Zerg");
        Runnable runnable1 = () -> {
            Iterator<Integer> integerIterator = map.keySet().iterator();
            while (integerIterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = integerIterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable runnable2 = () ->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(7, "Xena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
