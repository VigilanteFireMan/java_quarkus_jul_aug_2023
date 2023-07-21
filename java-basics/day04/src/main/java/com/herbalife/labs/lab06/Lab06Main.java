package com.herbalife.labs.lab06;

public class Lab06Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalcOperation adder = (a, b) -> a + b;
        calculator.operate(adder);
        calculator.operate((a, b) -> a - b);
        calculator.operate((a, b) -> a * b);
        calculator.operate((a, b) -> a / b);
        calculator.operate((a, b) -> a * a + b * b + 2 * a * b);
    }

}

interface CalcOperation {
    int compute(int a, int b);
}

class Calculator {
    public void operate(CalcOperation calcOperation) {
        System.out.println(calcOperation.compute(10, 5));
    }
//    public int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
}