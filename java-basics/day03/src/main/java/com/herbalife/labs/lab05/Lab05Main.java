package com.herbalife.labs.lab05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab05Main {
    static List<City> cities = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        List<String> linesInCsv = Files.readAllLines(Paths.get("./cities.csv"));
        populateCities(linesInCsv);
        printCitiesGroupedByCountries();
        printCityNameWithLargestAndSmallestPopulation();
        printPopulationOf("China");
    }

    private static void printPopulationOf(String country) {
        long total = 0;
        for (City city : cities) {
            if(city.country().equalsIgnoreCase("China")) {
                total += city.population();
            }
        }
        System.out.println("Total population of %s is %s".formatted(country, total));
    }

    private static void printCityNameWithLargestAndSmallestPopulation() {
        City smallestCity = cities.get(0);
        City largestCity = cities.get(0);
        for (City city : cities) {
            if(city.population() > largestCity.population()) {
                largestCity = city;
            }
            if(city.population() < smallestCity.population()) {
                smallestCity = city;
            }
        }
        System.out.println("Largest city is %s with population %s".formatted(largestCity.name(), largestCity.population()));
        System.out.println("Smallest city is %s with population %s".formatted(smallestCity.name(), smallestCity.population()));
    }

    private static void printCitiesGroupedByCountries() {
        Map<String, List<City>> countryCitiesMap = new HashMap<>();
        for (City city : cities) {
            if (countryCitiesMap.containsKey(city.country())) {
                countryCitiesMap.get(city.country()).add(city);
            } else {
                List<City> cityList = new ArrayList<>();
                cityList.add(city);
                countryCitiesMap.put(city.country(), cityList);
            }
        }
        System.out.println(countryCitiesMap);
    }


    private static void populateCities(List<String> linesInCsv) {
        for (String line : linesInCsv) {
            if (!line.contains("Population (Metropolitan Area)")) {
                String[] lineItems = line.split(",");
                City city = new City(lineItems[0], lineItems[1], Long.parseLong(lineItems[2]));
                cities.add(city);
            }
        }
    }
}
