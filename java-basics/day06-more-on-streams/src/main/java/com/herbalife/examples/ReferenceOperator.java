package com.herbalife.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferenceOperator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Ram", "Joe", "Mary");
        //Process this list and convert every item to a Person instance
        names
                .stream()
                .map(name -> new Person(name))
                .map(person -> person.toJson())
                .forEach(person -> System.out.println(person));
        names
                .stream()
                .map(Person::new)
                .map(Person::toJson)
                .forEach(System.out::println);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toJson() {
        return """
                {"name": "%s"}
                """.formatted(name).strip().stripIndent();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
