package com.herbalife.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        //try, catch, finally, throw, throws
        //Exceptions are grouped into two categories
        //Checked exceptions; Unchecked exceptions
        //Checked exceptions are classes that extend java.lang.Exception
        //Unchecked exceptions are classes that extend java.lang.RuntimeException

        //File operations, DB operations, Networking calls, Parsing Json are designed to throw Checked exceptions
        try {
            Files.readAllLines(Paths.get("./movies.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Files.readAllLines(Paths.get("./cities.txt"));
    }

    static void doSomeMath() {
        int i = 10;
        int j = 0;
        if(j == 0) {
            //throw new RuntimeException("j cannot be zero");
            throw new MyException("j cannot be zero");
        }
    }

    static void doSomething() {
        try {
            readDataFromFiles();
        } catch (IOException ex) {
        }
    }

    static void doSomethingElse() throws IOException {
        readDataFromFiles();
    }

    static void readDataFromFiles() throws IOException {
        Files.readAllLines(Paths.get("./cities.txt"));
    }
}

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}