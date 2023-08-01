package com.herbalife.examples;

import java.io.IOException;

public class InheritanceWithThrows {
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        truck.start();
    }
}

class Vehicle {
    public void start() throws OutOfFuel {
        System.out.println("Vehicle starting");
    }
}

class Truck extends Vehicle {

    public void start() throws FlatTyre/*, IOException */{
        //Connect to the remote DB and check for updates
        System.out.println("Truck starting");
    }
}


class OutOfFuel extends RuntimeException {
}

class FlatTyre extends RuntimeException {}