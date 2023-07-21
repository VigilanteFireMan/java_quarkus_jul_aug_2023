import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces1 {
    public static void main(String[] args) {
        //Predicate, Function, Supplier, Consumer

        //Predicate is a FI that accepts an argument of any type and returns a boolean
        int num = 10;
        Predicate<Integer> evenPredicate = number -> number % 2 == 0;

        if (evenPredicate.test(num)) {
            System.out.println("Even");
        }

        Predicate<Double> largeNumberPredicate = number -> number > 10000000;
        if (largeNumberPredicate.test(98789789d)) {
            System.out.println("Large number");
        }

        //Check if a given number is odd and greater than 10
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        Predicate<Integer> greaterThan10 = number -> number > 10;
        Predicate<Integer> lessThan0 = number -> number < 0;
        int input = 12;
        boolean result = isOdd
                .and(greaterThan10)
                .test(input);
        //Check if a given number is NOT (odd or greater than 10 or less than 0)
        boolean result2 = isOdd
                .or(greaterThan10)
                .or(lessThan0)
                .negate()
                .test(input);

    }
}

interface MyOwnPredicate {
    boolean test(int num);
}