package com.herbalife.examples;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        IntStream numbersStream = IntStream.range(1, 1000000);
        numbersStream
                .parallel() //by default creates a forkjoinpool with number of threads = (number of cores - 1)
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e + " on " + MyThreadUtil.name()));

    }
}
