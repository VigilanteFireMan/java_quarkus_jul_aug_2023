package com.herbalife.examples;

import com.herbalife.labs.lab01.Conference;
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

    @Inject
    Conference conference;

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
//        System.out.println(transportCompany.truck1);
//        System.out.println(transportCompany.truck2);
        System.out.println("Topics count of 60 minutes: " + conference.getTopicsCountOf(60));
        conference.getTopicsOf(60).forEach(System.out::println);

        System.out.println("Topics count of 90 minutes: " + conference.getTopicsCountOf(90));
        conference.getTopicsOf(90).forEach(System.out::println);

        System.out.println("Topics count of 45 minutes: " + conference.getTopicsCountOf(45));
        conference.getTopicsOf(45).forEach(System.out::println);


        return 0;
    }
}
