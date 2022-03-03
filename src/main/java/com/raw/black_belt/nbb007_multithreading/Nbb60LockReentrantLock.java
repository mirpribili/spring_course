package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Nbb60LockReentrantLock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsAppCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Call{
    private Lock lock = new ReentrantLock();
    void mobileCall(){
        lock.lock();
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("Mobile call ends");
    }
    void skypeCall(){
        lock.lock();
        System.out.println("Skype call starts");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("Skype call ends");
    }
    void whatsAppCall(){
        lock.lock();
        System.out.println("WhatsApp call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("WhatsApp call ends");
    }
}
