package com.herbalife.labs.lab08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab08ApproachI {
    static List<Item> items = Arrays.asList(
            new Item("Nike", 20.45),
            new Item("Adidas", 31.45),
            new Item("Reebok", 29.25),
            new Item("Puma", 25.15),
            new Item("Fila", 15.15));

    public static void main(String[] args) {
        printCostliestShoe();
        printCheapestShoe();
        concatenateItemNamesInCsv();
    }

    private static void concatenateItemNamesInCsv() {
        String csv = items
                .stream()
                .map(shoe -> shoe.getName())
                .collect(Collectors.joining(","));
        System.out.println(csv);
    }

    private static void printCostliestShoe() {
        Item costliestShoe = items
                .stream()
                .reduce((currentShoe, nextShoe) -> currentShoe.getPrice() > nextShoe.getPrice() ? currentShoe : nextShoe)
                .get();
        System.out.println(costliestShoe);
    }

    private static void printCheapestShoe() {
        Item costliestShoe = items
                .stream()
                .reduce((currentShoe, nextShoe) -> currentShoe.getPrice() < nextShoe.getPrice() ? currentShoe : nextShoe)
                .get();
        System.out.println(costliestShoe);
    }
}
