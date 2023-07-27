package com.herbalife.examples;

public class ThreadingExample {
    public static void main(String[] args) {
        //Thread for writing code continuously
//        Thread coderThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(true) {
//                    System.out.println("Writing Java code");
//                    try {
//                        Thread.sleep(3000);
//                    }
//                    catch(Exception ex) {}
//                }
//            }
//        });
        Thread coderThread = new Thread(() -> {
            while (true) {
                System.out.println("Writing Java code on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (Exception ex) {
                }
            }
        });
        coderThread.start();

        Thread searchOnStackOverflowThread = new Thread(() -> {
            while (true) {
                System.out.println("Searching on Stack overflow on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (Exception ex) {
                }
            }
        });
        searchOnStackOverflowThread.start();

        Thread scratchingHeadThread = new Thread(() -> {
            while (true) {
                System.out.println("Scratching my head on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (Exception ex) {
                }
            }
        });
        scratchingHeadThread.start();

    }
}
