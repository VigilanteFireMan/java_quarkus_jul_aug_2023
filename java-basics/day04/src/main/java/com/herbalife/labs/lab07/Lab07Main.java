package com.herbalife.labs.lab07;
import static com.herbalife.labs.lab07.ValidationConstants.*;

public class Lab07Main {
    public static void main(String[] args) {
        String userName = "samyboy";
        String password = "Sam12345";

        boolean userNameValid = isNotNull
                .and(isNotEmpty)
                .and(isNotBlank)
                .and(userNameLength)
                .test(userName);
        boolean passwordValid = isNotNull
                .and(isNotEmpty)
                .and(isNotBlank)
                .and(passwordLength)
                .and(hasDigit)
                .and(hasUpperCase)
                .test(password);
        System.out.println("Username valid %b".formatted(userNameValid));
        System.out.println("Password valid %b".formatted(passwordValid));
    }
}
