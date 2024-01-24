package com.hsenid.springScheduler.executorService;

import java.util.concurrent.*;


public class ConcurrencyExample {
    public static void main(String[] args) {
        // Create a FixedThreadPool with 3 threads
        ExecutorService executor1 = Executors.newFixedThreadPool(3);
        ExecutorService executor2 = Executors.newSingleThreadExecutor();


        // Submit tasks for execution
        for (int i = 0; i < 5; i++) {
            executor1.submit(new MyTask(i));
        }
        executor1.shutdown();

        for (int i = 0; i < 10; i++) {
            executor2.submit(new MyTask(i));
        }
        executor2.shutdown();

    }
}

