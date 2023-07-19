package com.herbalife.labs.lab02;

public class Lab02 {
    public static void main(String[] args) {
        calculateSumOfOddNumbersBetween1To10001();
        calculateIntegerAverageOfAllNumbersFrom1To10001();
        calculateSum();
    }

    private static void calculateSum() {
        String input = "+5 -1 +9 +5 -67 +5 -3 +2 -4 +6 +8 -13 +2 -4 +6 +18 -3 +2 -4 +6 +88 +15 -1 +9 +5 -67 +45 -3 +2 -4 +36 +8 -13 +2 -4 +6 +18 -3 +2 -74 +11 +109";
        String items[] = input.split(" ");
        int sum = 0;
        for (String item: items) {
            sum += Integer.parseInt(item);
        }
        System.out.println("Sum is %d".formatted(sum));
    }

    private static void calculateIntegerAverageOfAllNumbersFrom1To10001() {
        int sum = 0;
        for (int i = 0; i <= 10001; i++) {
            sum += i;
        }
        int[] exclusionList = {10, 19, 21, 39, 309, 431, 643, 942, 1209, 7981, 8888, 9910};
        for (int number: exclusionList) {
            sum -= number;
        }
        int average = (int)(sum/(10001 - exclusionList.length));
        System.out.println("Average is %d".formatted(average));
    }

    private static void calculateSumOfOddNumbersBetween1To10001() {
        int sum = 0;
        for (int i = 0; i < 10001; i++) {
            sum += i % 2 == 1 ? i : 0;
        }
        System.out.println("Sum of odd numbers is %d".formatted(sum));
    }
}
