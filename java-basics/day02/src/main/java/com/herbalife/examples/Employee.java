package com.herbalife.examples;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void work(int hours) {
        System.out.println("Employee %s is working %d hours".formatted(name, hours));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
