package com.example.FunctionalInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSample {
    public static void main (String [] args) throws InterruptedException{
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);
        while (true){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    // do your work here..
                    System.out.println("Executed!");

                }});
            Thread.sleep(5000);
        }

    }
}
