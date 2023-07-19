package com.herbalife.examples.access;

import com.herbalife.examples.Player;

public class AccessSpecifiersMain {
    public static void main(String[] args) {
        Player player = new Player();
        player.id = 1010;
        //player.name = "Sam";
        //player.salary = 101001;
        //Animal animal = new Animal(); //ERROR
        Animal animal = new Dog();
    }
}

abstract class Animal {
    public void eat() {
    }

    abstract void makeNoise();
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("bow bow");
    }
}

class VideoGamePlayer extends Player {
    public void play() {
        System.out.println("Earning " + this.salary);
    }
}