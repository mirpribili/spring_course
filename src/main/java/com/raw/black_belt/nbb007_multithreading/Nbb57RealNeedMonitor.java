package com.raw.black_belt.nbb007_multithreading;

public class Nbb57RealNeedMonitor {
    static final Object lock = new Object();

    void mobileCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        }
    }
    void whatsappCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            Thread.sleep(2000);
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
        // задача поставить звонки на ожидание при имеющемся уже звонке
    }
}
class RunnableImpMobile implements Runnable{
    @Override
    public void run() {
        try {
            new Nbb57RealNeedMonitor().mobileCall();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class RunnableImpSkype implements Runnable{
    @Override
    public void run() {
        try {
            new Nbb57RealNeedMonitor().skypeCall();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class RunnableImpWhatsApp implements Runnable{
    @Override
    public void run() {
        try {
            new Nbb57RealNeedMonitor().whatsappCall();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

