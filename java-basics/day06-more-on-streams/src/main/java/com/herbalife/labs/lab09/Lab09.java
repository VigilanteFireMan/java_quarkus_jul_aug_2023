package com.herbalife.labs.lab09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab09 {
    static List<String> itemsInCsv;
    static Function<String, String> cityExtractorFunction = line -> line.split(",")[0];
    static Function<String, String> countryExtractorFunction = line -> line.split(",")[1];
    static String placeJson = """
            {"city": "%s", "country": "%s", "population": %s}
            """;
    static String countryJson = """
            {"country": "%s", "cities": [%s]}
            """;
    static String cityJson = """
            {"name": "%s", "population": %s}
            """;

    public static void main(String[] args) throws IOException {
        itemsInCsv = Files.readAllLines(Paths.get("./cities.csv"));
        storeNamesOf(cityExtractorFunction, "cities.txt");
        storeNamesOf(countryExtractorFunction, "countries.txt");
        printCountOfAllCitiesGroupedByCountry();
        generatePlacesJson();
        generatePlacesJsonDifferentFormat();
    }

    private static void generatePlacesJsonDifferentFormat() throws IOException {
        final var countryCitiesMap = itemsInCsv
                .stream()
                .skip(1)
                .collect(Collectors.groupingBy(countryExtractorFunction));
        String json = countryCitiesMap
                .keySet()
                .stream()
                .map(countryName -> Lab09.convertPlacesToJson(countryName, countryCitiesMap.get(countryName)))
                .collect(Collectors.joining(",", "[", "]"));
        Files.write(Paths.get("./places2.json"), json.getBytes());
    }

    private static String convertPlacesToJson(String countryName, List<String> lineItems) {
        String citiesInJson = lineItems
                .stream()
                .map(line -> cityJson.formatted(line.split(",")[0], line.split(",")[2]))
                .collect(Collectors.joining(","));
        countryJson.formatted(countryName, citiesInJson);
        return countryJson;
    }

    private static void generatePlacesJson() throws IOException {
        String json = itemsInCsv
                .stream()
                .skip(1)
                .map(Lab09::convertPlacesItemToJson)
                .collect(Collectors.joining(",\n", "[", "]"));
        Files.write(Paths.get("./places.json"), json.getBytes());
    }

    private static String convertPlacesItemToJson(String lineInCsv) {
        String[] items = lineInCsv.split(",");
        return placeJson.formatted(items[0], items[1], items[2]).strip();
    }

    private static void printCountOfAllCitiesGroupedByCountry() {
        //Map<String, List<String>> countryCitiesMap = itemsInCsv
        var countryCitiesMap = itemsInCsv
                .stream()
                .skip(1)
                .collect(Collectors.groupingBy(countryExtractorFunction));
        //countryCitiesMap = "hello";
        countryCitiesMap
                .forEach((k, v) -> {
                    System.out.println("%s, Cities count: %s".formatted(k, v.size()));
                });
    }

    private static void storeNamesOf(Function<String, String> processFunction, String fileName) throws IOException {
        Set<String> names = itemsInCsv
                .stream()
                .skip(1)
                .map(processFunction)
                //.distinct()
                .collect(Collectors.toSet());
        Files.write(Paths.get("./%s".formatted(fileName)), names);
    }
}
