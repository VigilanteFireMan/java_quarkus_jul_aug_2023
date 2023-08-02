package com.herbalife;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class HelloWorld implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello there! Quarkus! This is a command line application");
        return 0;
    }
}
