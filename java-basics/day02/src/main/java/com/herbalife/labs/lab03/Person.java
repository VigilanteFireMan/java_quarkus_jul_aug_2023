package com.herbalife.labs.lab03;

import java.util.Arrays;

public class Person {
    private String name;
    private City[] citiesVisited;
    private Person friend;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public City[] getCitiesVisited() {
        return citiesVisited;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public void visitCity(City city) {
        if (citiesVisited == null) {
            citiesVisited = new City[]{city};
        } else {
            City[] newCitiesVisitedArr = new City[citiesVisited.length + 1];
            for(int i = 0; i < citiesVisited.length; i++) {
                newCitiesVisitedArr[i] = citiesVisited[i];
            }
            newCitiesVisitedArr[citiesVisited.length] = city;
            this.citiesVisited = newCitiesVisitedArr;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", citiesVisited=" + Arrays.toString(citiesVisited) +
                '}';
    }
}
