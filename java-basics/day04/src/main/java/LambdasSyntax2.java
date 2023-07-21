public class LambdasSyntax2 {
    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;
        System.out.println(adder.add(10, 12));

        Adder adder2 = (int a, int b) -> a + b;
        System.out.println(adder2.add(11, 11));

        Adder adder3 = (a, b) -> {
            System.out.println(a + ", " + b);
            return a + b;
        };
    }
}

@FunctionalInterface
interface Adder {
    int add(int a, int b);
}