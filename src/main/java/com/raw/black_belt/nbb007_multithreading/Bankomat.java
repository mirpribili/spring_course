package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Lena1", lock);
        new Employee("Lena2", lock);
        Thread.sleep(3000);
        new Employee("Lena3", lock);
        new Employee("Lena4", lock);
        new Employee("Lena5", lock);
    }
}
class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock()) {
            System.out.println(name + " ждет... ");
            //lock.lock();
            System.out.println(name + " пользуется банкоматом");
            try {
                Thread.sleep(1000);
                System.out.println(name + " завершил свой сеанс");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать");
        }
    }
}