package com.herbalife.examples;

public class ThreadingExample {
    public static void main(String[] args) {
        //Thread for writing code continuously
        Thread coderThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("Writing Java code");
                    try {
                        Thread.sleep(3000);
                    }
                    catch(Exception ex) {}
                }
            }
        });
        coderThread.start();
    }
}
