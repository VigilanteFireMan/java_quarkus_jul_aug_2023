package com.herbalife.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolsInConcurrentPackage {
    public static void main(String[] args) {
        //Create a thread pool with n number of threads
        //Submit activity to the thread pool
        //Thread pool automatically picks up a thread from the pool and runs the activity

        //ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            while(true) {
                System.out.println("Writing code on " + MyThreadUtil.name());
                MyThreadUtil.sleep(2);
            }
        });

        executorService.submit(() -> {
            while(true) {
                System.out.println("Searching on StOvFl on " + MyThreadUtil.name());
                MyThreadUtil.sleep(10);
            }
        });

        executorService.submit(() -> {
            int count = 0;
            while(count < 5) {
                System.out.println("Scratching my head on " + MyThreadUtil.name());
                MyThreadUtil.sleep(3);
                count++;
            }
        });

        executorService.submit(() -> {
            while(true) {
                System.out.println("Chatting with my colleague " + MyThreadUtil.name());
                MyThreadUtil.sleep(4);
            }
        });
    }
}
