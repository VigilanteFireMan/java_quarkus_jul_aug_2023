package com.herbalife.examples;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumerExamples {
    public static void main(String[] args) {
        //Supplier does not accept any argument and returns value of ANY type
        Supplier<Integer> randomNumberSupplier = () -> (int)(Math.random() * 100);
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());

        Supplier<String> currentTime = () -> Instant.now().toString();
        System.out.println(currentTime.get());

        //Supplier is used in db calls where instead of returning results which may or may not be present; you return a supplier
        //Will discuss more when we use DB calls

        //Consumer accepts argument of ANY type and returns nothing
        Consumer<String> print = data -> System.out.println(data);
        print.accept("hello");
        Consumer<String> log = data -> {
            System.out.println("Logging the information");
            System.out.println(data);
        };
        log.accept("Error while serializing data");
        Consumer<String> emailer = data -> {
            System.out.println("Emailing " + data);
        };
        emailer.accept("Error notification");
        //forEach

        List<String> cities = Arrays.asList("Houston", "Chennai", "Tokyo");
        cities.forEach(city -> System.out.println(city));
        cities.forEach(print);
        cities.forEach(log);
        cities.forEach(System.out::println); //YET TO EXPLAIN

    }
}
