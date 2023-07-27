package com.herbalife.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Hello {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello there");
        City city = new City();
        city.setName("London");
        city.setCountry("UK");
        city.setPopulation(8_000_000);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(city);
        System.out.println(json);
    }
}
