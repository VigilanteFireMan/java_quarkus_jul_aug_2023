package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class StylesOfProgramming {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Golang", "Rust", "JavaScript", "C#");
        //Print all the languages starting with letter J

        //Imperative style of programming
        //You write code and say what to do and also how to do things
        //Verbose
        //You start defining mutable variables
        //Concurrency is a pain
        for (int i = 0; i < languages.size(); i++) {
            String language = languages.get(i);
            if (language.startsWith("J")) {
                System.out.println(language);
            }
        }

        //Declarative style of programming
        //You write code and say what to do AND NOT how to do
        //Reads seamlessly
        //Chaining of functions
        //No data scatter anywhere; Promotes immutability
        //Implementing Concurrency does not require you to change your design
        languages
                .stream()
                .parallel()
                .filter(e -> e.startsWith("J"))
                .forEach(System.out::println);
    }
}
