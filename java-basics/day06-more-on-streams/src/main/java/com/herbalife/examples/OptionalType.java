package com.herbalife.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalType {
    static Map<Integer, String> romanNumbers = new HashMap<>();

    public static void main(String[] args) {
        romanNumbers.put(1, "I");
        romanNumbers.put(2, "II");
        romanNumbers.put(3, "III");

        String rn1 = getRomanNumberOf(1);
        System.out.println(rn1 + ", Length is: " + rn1.length());

        String rn2 = getRomanNumberOf(2);
        System.out.println(rn2 + ", Length is: " + rn2.length());

        String rn4 = getRomanNumberOf(4);
        //System.out.println(rn4 + ", Length is: " + rn4.length());

        Optional<String> rn5 = getRomanNumeralOf(5);
        if(rn5.isPresent()) {
            String value = rn5.get();
            System.out.println(value + ", Length is: " + value.length());
        } else {
            System.out.println("Roman number of 5 is not found");
        }
    }

    static Optional<String> getRomanNumeralOf(int number) {
        Optional<String> result = Optional.empty();
        if(romanNumbers.containsKey(number)) {
            result = Optional.of(romanNumbers.get(number));
        }
        return result;
    }

    static String getRomanNumberOf(int number) {
        if(romanNumbers.containsKey(number)) {
            return romanNumbers.get(number);
        }
        return null;
    }
}
