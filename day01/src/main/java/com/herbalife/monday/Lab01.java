package com.herbalife.monday;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game. Enter a number between 1 and 100.");
        int target = (int) (Math.random() * 100);
        int attempts = 0;
        String message = "";
        int guess = -1;
        boolean gameOver = false;
        while (!gameOver) {
            guess = scanner.nextInt();
            attempts++;
            message = switch (Integer.compare(guess, target)) {
                case 1 -> "Aim lower";
                case -1 -> "Aim higher";
                default -> {
                    gameOver = true;
                    yield "You have got it in " + attempts + " attempts";
                }
            };
            System.out.println(message);
        }
        scanner.close();
    }
}
