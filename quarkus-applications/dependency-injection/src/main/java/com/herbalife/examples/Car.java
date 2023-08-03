package com.herbalife.examples;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Car {
    @Inject
    Engine engine;

    public void drive() {
        System.out.println("Driving the car " + this + " with engine " + engine);
    }
}

@Singleton
class Engine {

}