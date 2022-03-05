package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Nbb65RunnableFactorial {
    static int factorialResult;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =
                Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);
        executorService.shutdown();
        // ->_ like join
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}
class Factorial implements Runnable{
    int f;
    public Factorial(int f){
        this.f = f;
    }
    @Override
    public void run() {
        if (f<=0){
            System.out.println("Wrong input");
            return;
        }
        int result = 1;
        for (int i =1; i<=f;i++){
            result*=i;
        }
        Nbb65RunnableFactorial.factorialResult = result;
    }
}