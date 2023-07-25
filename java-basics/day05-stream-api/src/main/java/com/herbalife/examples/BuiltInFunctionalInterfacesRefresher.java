package com.herbalife.examples;

import java.util.function.*;

public class BuiltInFunctionalInterfacesRefresher {
    public static void main(String[] args) {
        //stream API filter methods accept predicates as argument
        Predicate<Integer> isEven = (Integer number) -> number % 2 == 0;
        System.out.println(isEven.test(12));

        Predicate<String> isBlank = value -> value.isBlank();
        System.out.println(isBlank.test(""));

        IntPredicate isOdd = number -> number % 2 != 0;
        BiPredicate<Integer, Integer> greater = (number1, number2) -> number1 > number2;
        System.out.println(greater.test(12, 10));
        System.out.println(greater.test(1, 12));

        //stream API map methods accept Function as argument
        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(12));

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(12, 12));

        IntToDoubleFunction areaOfACircle = radius -> 3.14 * radius * radius;
        System.out.println(areaOfACircle.applyAsDouble(12));
    }
}
