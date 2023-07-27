package com.herbalife.examples;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadingStrategy {
    public static void main(String[] args) {
        //How many threads do you create in an application?
        //100 threads or 200 threads? but your application is running in a 2-core-CPU VM

        //IO intensive - DB calls; File operations; Calling other APIs or services
        //CPU intensive - Complex algorithm involving a lot of recursive calls; serializing very very large objects
        //Number of threads =  { number of CPU cores / (1 - BlockingFactor) }
        //BlockingFactor 0-1
        //CPU intensive BlockingFactor is  0.1-0.4
        //IO intensive BlockingFactor is almost close to 1

        int numberOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores: " + numberOfCores);
        double blockingFactor = 0.9; //Multiple simultaneous DB calls
        int numberOfThreads = (int)(numberOfCores / (1 - blockingFactor));
        System.out.println("Number of threads for DB calls: " + numberOfThreads);
        Executor executor = Executors.newFixedThreadPool(numberOfThreads);

        System.out.println();
        blockingFactor = 0.2; //Multiple complex parsing logic
        numberOfThreads = (int)(numberOfCores / (1 - blockingFactor));
        System.out.println("Number of threads for complex parsing logic: " + numberOfThreads);

    }
}
