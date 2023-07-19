package com.herbalife.labs.lab03;

public class Lab03Main {
    public static void main(String[] args) {
        Person sam = new Person("Sam");
        City houston = new City("Houston", new Country("USA", "DC", 2342343));
        City pune = new City("Pune", new Country("India", "ND", 32342343));
        sam.visitCity(houston);
        sam.visitCity(pune);

        Person ram = new Person("Ram");
        sam.setFriend(ram);
        ram.setFriend(sam);
        System.out.println(sam);
        System.out.println(sam.getFriend());
    }
}
