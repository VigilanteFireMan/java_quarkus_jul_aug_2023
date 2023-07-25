package com.herbalife.labs.lab08;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Lab08ApproachII {
    static List<Item> items = Arrays.asList(
            new Item("Nike", 20.45),
            new Item("Adidas", 31.45),
            new Item("Reebok", 29.25),
            new Item("Puma", 25.15),
            new Item("Fila", 15.15));

    public static void main(String[] args) {
        printShoeBasedOn((currentShoe, nextShoe) -> currentShoe.getPrice() > nextShoe.getPrice() ? currentShoe : nextShoe);
        printShoeBasedOn((currentShoe, nextShoe) -> currentShoe.getPrice() < nextShoe.getPrice() ? currentShoe : nextShoe);
        concatenateItemNamesInCsv();
    }

    private static void printShoeBasedOn(BinaryOperator<Item> binaryOperator) {
        Item shoe = items
                .stream()
                .reduce(binaryOperator)
                .get();
        System.out.println(shoe);
    }

    private static void concatenateItemNamesInCsv() {
        String csv = items
                .stream()
                .map(shoe -> shoe.getName())
                .collect(Collectors.joining(","));
        System.out.println(csv);
    }

}
