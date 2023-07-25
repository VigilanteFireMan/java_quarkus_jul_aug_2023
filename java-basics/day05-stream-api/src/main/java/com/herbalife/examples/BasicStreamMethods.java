package com.herbalife.examples;

import java.util.Arrays;
import java.util.List;

public class BasicStreamMethods {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Haskell", "Rust", "Golang", "Scala");

        //THE UNDERLYING COLLECTION IS NOT MODIFIED

        //filter()
        languages
                .stream()
                .filter(lang -> lang.contains("s") || lang.contains("S")) //applies this predicate on every item and returns a new collection
                .forEach(lang -> System.out.println(lang));

        //Print all the languages in Uppercase
        languages
                .stream()
                .map(lang -> lang.toUpperCase())//applies this Function on every item and returns a new collection with same size
                .forEach(lang -> System.out.println(lang));
    }
}
