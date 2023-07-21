package com.herbalife.labs.lab07;

import java.util.function.Function;
import java.util.function.Predicate;

public interface ValidationConstants {
    Predicate<String> isNotEmpty = value -> !value.isEmpty();
    Predicate<String> isNotBlank = value -> !value.isBlank();
    Predicate<String> isNotNull = value -> value != null;

    //WILL NEED TO MODIFY USING Function<>
    Function<Integer, Predicate<String>> minLength = number -> {
        return value -> value.length() >= number;
    };
    Function<Integer, Predicate<String>> maxLength = number -> {
        return value -> value.length() <= number;
    };

//    Predicate<String> userNameLength = value -> value.length() >= 6 && value.length() <= 12;
//    Predicate<String> passwordLength = value -> value.length() >= 8 && value.length() <= 14;

    Predicate<String> hasDigit = value -> value.matches(".*\\d+.*");
    Predicate<String> hasUpperCase = value -> value.matches(".*[A-Z].*");
}
