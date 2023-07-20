package com.herbalife.examples;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class CommonClasses {
    public static void main(String[] args) {
        //java.lang package is available to all the code we write
        //String, Object

        //java.io or java.nio is for Input output operations
        //java.net
        //java.util contains the collection classes

        List<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Ram");
        names.add("Joe");

        Map<Integer, String> romanNumerals = new HashMap<>();
        romanNumerals.put(1, "I");
        romanNumerals.put(2, "II");
        romanNumerals.put(3, "III");

        Set<Integer> numbers = new HashSet<>();
        numbers.add(101);
        numbers.add(102);
        numbers.add(101); //Ignores

        Date dt = new Date();
        System.out.println(dt.getTime());
        Calendar cldr = Calendar.getInstance(TimeZone.getTimeZone("en-US"));

        //java.time
        Instant now = Instant.now();
        LocalDate localDate = LocalDate.now();

        //java.sql
    }
}
