package com.herbalife.examples;

public class InheritanceUser {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Sam", 4);
        m.work(8);

        Employee emp = new Manager(102, "Mary", 5);
        emp.work(10);
    }
}
