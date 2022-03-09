package com.raw.black_belt.nbb007a_collections_thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Nbb73SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayListNoSynchronized =
                new ArrayList<>();
        List<Integer> arrayList =
                Collections.synchronizedList(
                        arrayListNoSynchronized);

        for (int i = 0; i <1000; i++){
            arrayList.add(i);
        }
        Runnable runnable2 = ()->{
            arrayList.remove(10);
        };
        Runnable runnable1 = () ->{
            synchronized (arrayList) { // <---------- !!!!!!!!!!!!!!!
                Iterator<Integer> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(arrayList);
    }
}
