package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class InternalsOfStream {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("JavaScript", "Java", "Scala", "Ruby");
        //Find the languages that start with J and print them in Uppercase
        languages
                .stream()
                .filter(lang -> {
                    System.out.println("*****Inside filter " + lang);
                    return lang.startsWith("J");
                })
                .map(lang -> {
                    System.out.println("=====Inside map " + lang);
                    return lang.toUpperCase();
                });
               // .forEach(System.out::println);


        //Find any 1 language that start with J and print it in Uppercase
        String result = languages
                .stream()
                .filter(lang -> {
                    System.out.println("*****Inside filter " + lang);
                    return lang.startsWith("J");
                })
                .map(lang -> {
                    System.out.println("=====Inside map " + lang);
                    return lang.toUpperCase();
                })
                .findAny()
                .get();
        System.out.println(result);
    }
}
