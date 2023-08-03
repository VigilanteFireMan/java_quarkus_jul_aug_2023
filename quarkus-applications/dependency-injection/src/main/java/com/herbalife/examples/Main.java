package com.herbalife.examples;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Door door;

    @Inject
    Car car;

    @Inject
    Person person;

    @Inject
    Book book1;

    @Inject
    Book book2;

    @Inject
    Company company;

    @Inject
    NutritionService nutritionService;

    @Inject
    NutritionServiceUtil nutritionServiceUtil;

    @Inject
    TransportCompany transportCompany;

    @Override
    public int run(String... args) throws Exception {
//        System.out.println("This is the starting point!");
//        //Car car = new Car(); //DO NOT CREATE OBJECTS LIKE THIS
//        //car.drive();
//        person.work();
//        car.drive();
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book1.publisher);
//        System.out.println(book2.publisher);
//        System.out.println(door.getAlarm());
//        System.out.println(company);
//        System.out.println(nutritionService.getUrl() + " " + nutritionService.getUsername() + " " + nutritionService.getPassword() + " " + nutritionService.getAppId());
//        System.out.println(nutritionServiceUtil.url() + " " + nutritionServiceUtil.username() + " " + nutritionServiceUtil.password() + " " + nutritionServiceUtil.appId());
//        System.out.println(nutritionServiceUtil.vendor());
        System.out.println(transportCompany.truck1);
        System.out.println(transportCompany.truck2);
        return 0;
    }
}
