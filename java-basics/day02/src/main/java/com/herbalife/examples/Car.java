package com.herbalife.examples;

//Java bean is a POJO with private members, public getters/setters and a default no-arg constructor
public class Car {
    private String model;
    private int yearOfMake;
    private Engine engine;


    public Car() {
    }

    public Car(String model, int yearOfMake, String engineType) {
        this.model = model;
        this.yearOfMake = yearOfMake;
        this.engine = new Engine(engineType);
    }

    public Car(String model, int yearOfMake) {
        this.model = model;
        this.yearOfMake = yearOfMake;
        this.engine = new Engine("IC");
    }

    //getter, setter methods are referred to as properties

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfMake=" + yearOfMake +
                ", engine=" + engine.getType() +
                '}';
    }
}
