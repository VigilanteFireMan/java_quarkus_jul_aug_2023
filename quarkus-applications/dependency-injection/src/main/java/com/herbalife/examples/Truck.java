package com.herbalife.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

//NOT WORKING

@Dependent
public class Truck {
    public Truck() {
        System.out.println("Truck created " + this);
    }
}

@ApplicationScoped
class TransportCompany {
    @Inject
    Truck truck1;

    @Inject
    Truck truck2;
}