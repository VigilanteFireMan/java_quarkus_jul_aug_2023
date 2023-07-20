package com.herbalife.examples;

public class InterfacesExample {
    public static void main(String[] args) {
        Shape square = new Square() {};
        Figure square2 = new Square() {};
        Printer printer = new PrinterImpl();

        printer.print("some data");
        printer.printInUpperCase("some data");
        Printer.doSomething();
    }
}

interface InkjetPrinter extends Printer {}

interface Printer {
    void print(String data);
    default void printInUpperCase(String data) {
        System.out.println(data.toUpperCase());
    }
    static void doSomething() {

    }
}

class PrinterImpl implements Printer {
    public void print(String data) {
        System.out.println(data);
    }
}


interface Shape {
    int area();
}

interface Figure {
    void draw();
}

class Square implements Shape, Figure {
    @Override
    public int area() {
        return -1;
    }

    @Override
    public void draw() {

    }
}
