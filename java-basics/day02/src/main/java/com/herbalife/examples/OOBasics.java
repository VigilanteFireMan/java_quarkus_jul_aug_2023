package com.herbalife.examples;

public class OOBasics {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2020);
        System.out.println(car1.getModel());
        System.out.println(car1.getYearOfMake());

        Car car2 = new Car("Tesla", 2022, "Electric");
        System.out.println(car2);
        final int i = 10;

        System.out.println(Company.getNumberOfCompanies());
        System.out.println("Creating an instance of Company");

        Company hl = new Company("Herbalife");
        System.out.println(hl.getName());
        System.out.println(Company.getNumberOfCompanies());

        //NOT RECOMMENDED
        System.out.println(hl.getNumberOfCompanies());


    }
}
