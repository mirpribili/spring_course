package com.raw.black_belt.nbb007_multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Nbb67SumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);
        List<Future<Long>>futuresResults = new ArrayList<>();
        long valueDividerBy10 = value/10;
        for (int i = 0; i < 10; i++){
            long from = valueDividerBy10*i+1;
            long to = valueDividerBy10*(i+1);
            PartialSum partialSum =
                    new PartialSum(from,to);
            Future<Long>futurePartial = executorService.submit(partialSum);
            futuresResults.add( futurePartial );
        }
        for (Future<Long> result: futuresResults){
            sum+=result.get();
        }
        executorService.shutdown();
        System.out.println(sum);
    }

}
class PartialSum implements Callable<Long>{
    long from;
    long to;
    long localSum;
    public PartialSum(long from, long to){
        this.from = from;
        this.to = to;
    }
    @Override
    public Long call() throws Exception {
        for (long i = from; i<=to; i++){
            localSum+=i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}