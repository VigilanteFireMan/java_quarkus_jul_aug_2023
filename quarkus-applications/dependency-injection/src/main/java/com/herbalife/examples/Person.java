package com.herbalife.examples;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Person {
    @Inject
    Car car;

    public void work() {
        System.out.println("Person " + this + " is driving to office in " + car);
    }
}
