package com.herbalife;

import jakarta.inject.Inject;

public class Car {
    @Inject
    private Engine engine;

    @Inject
    private Chassis chassis;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }
}
