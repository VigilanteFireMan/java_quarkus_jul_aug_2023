package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicsOfStreamAPI {
    public static void main(String[] args) {
        //Stream API was introduced in Java 1.8 (or crudely Java 8)
        //It's a declarative way of processing collections
        //Create a stream by using .stream() method
        //Stream is an abstraction or snapshot of a collection
        //Streams cannot be reused
        //Streams are lazily evaluated. They are evaluated only when the terminal condition is met
        //The methods in Stream API have code addressing ONE item in a collection; The looping is taken up by the internal implementation
        List<String> languages = Arrays.asList("Java", "Haskell", "Rust", "Golang", "Scala");
        Stream<String> langStream = languages.stream();
        langStream
                .filter(it -> it.length() > 4)
                .forEach(it -> System.out.println(it));
        //ERROR
//        langStream
//                .filter(it -> it.length() > 4)
//                .forEach(it -> System.out.println(it));

        languages
                .stream()
                .filter(it -> it.length() > 4)
                .forEach(it -> System.out.println(it));

        Stream<String> filteredLangStream = languages
                .stream()
                .filter(it -> it.length() <= 4);

        //Stream is evaluated only when the terminal statement is met
        //terminal statements like forEach, collect, get


//        for (int i=0;i< languages.size();i++) {
//            String language = languages.get(i);
//            if(language.length() > 4) {
//                System.out.println(language);
//            }
//        }
    }
}
