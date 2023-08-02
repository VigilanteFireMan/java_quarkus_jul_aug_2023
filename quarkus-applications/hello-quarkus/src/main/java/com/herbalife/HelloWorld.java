package com.herbalife;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class HelloWorld implements QuarkusApplication {

    @Inject
    Car car;

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello there! Quarkus! This is a command line application");
//        Car car = new Car();
//        Engine engine = new Engine();
//        Chassis chassis = new Chassis();
//        car.setEngine(engine);
//        car.setChassis(chassis);
        return 0;
    }
}
