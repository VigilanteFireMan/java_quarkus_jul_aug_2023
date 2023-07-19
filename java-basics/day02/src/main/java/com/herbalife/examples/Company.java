package com.herbalife.examples;

public class Company {
    private String name;
    private static int numberOfCompanies;

    static {
        //static initializer block
        numberOfCompanies = 0;
        System.out.println("****Inside static initializer block");
    }

    public Company(String name) {
        this.name = name;
        numberOfCompanies++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfCompanies() {
        return numberOfCompanies;
    }

    public static void setNumberOfCompanies(int numberOfCompanies) {
        Company.numberOfCompanies = numberOfCompanies;
    }
}
