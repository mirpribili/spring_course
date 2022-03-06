package com.raw.black_belt.nbb007_multithreading;

import java.util.concurrent.*;

public class Nbb66CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newSingleThreadExecutor();
        FactorialWithCallable factorial = new FactorialWithCallable(5);
        Future<Integer> future = executorService.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
//            e.printStackTrace();
            System.out.println(e.getCause());
        }finally {
            executorService.shutdown();
        }
        System.out.println("ends main");
    }
}
class FactorialWithCallable implements Callable<Integer>{
    int f;

    public FactorialWithCallable(int f){
        this.f=f;
    }
    @Override
    public Integer call() throws Exception {
        if (f<=0){
            throw new Exception("Wrong input (<=0)");
        }
        int result = 1;
        for (int i = 1; i<=f;i++){
            result *=i;
        }
        return result;
    }
}