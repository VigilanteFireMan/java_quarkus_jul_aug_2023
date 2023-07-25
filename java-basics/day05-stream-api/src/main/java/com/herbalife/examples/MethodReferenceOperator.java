package com.herbalife.examples;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceOperator {
    public static void main(String[] args) {
        //:: is the method reference operator
        //:: is called the scope operator in C++
        //It's like a pointer to a function

        Consumer<String> printer = data -> System.out.println(data);
        Consumer<String> logger = data -> {
            System.out.println("*****Beginning to print data on the console");
            System.out.println(data);
            System.out.println("=====Current time is %s".formatted(Instant.now().toString()));
            System.out.println("*****End of printing data on the console");
        };
        logger.accept("DB operations");

        Consumer<String> logger2 = LoggerUtil::log;
        logger2.accept("File operations");

        List<String> languages = Arrays.asList("Java", "Haskell", "JavaScript", "Scala");
        languages
                .stream()
                .map(lang -> lang.toUpperCase())
                .forEach(lang -> {
                    System.out.println("*****Beginning to print data on the console");
                    System.out.println(lang);
                    System.out.println("=====Current time is %s".formatted(Instant.now().toString()));
                    System.out.println("*****End of printing data on the console");
                });

        languages
                .stream()
                .map(lang -> lang.toUpperCase())
                .forEach(LoggerUtil::log);

        languages
                .stream()
                .map(String::toUpperCase)
                .forEach(LoggerUtil::log);

        languages
                .stream()
                .map(lang -> lang.toUpperCase())
                .forEach(data -> LoggerUtil.log(data));


    }
}

class LoggerUtil {
    public static void log(String data) {
        System.out.println("*****Beginning to print data on the console");
        System.out.println(data);
        System.out.println("=====Current time is %s".formatted(Instant.now().toString()));
        System.out.println("*****End of printing data on the console");
    }
}
