import java.util.function.BiFunction;
import java.util.function.Function;

public class BuiltInFunctionalInterfaces2 {
    public static void main(String[] args) {
        //Predicate, Function, Supplier, Consumer

        //Function is a functional interface that accepts argument of ANY type and returns output of ANY type

        Function<String, Integer> length = value -> value.length();
        System.out.println(length.apply("hello"));

        Function<Integer, Integer> square = number -> number * number;
        System.out.println(square.apply(12));

        //take a number, increment it by 1, square it, and double it
        Function<Integer, Integer> incrementor = num -> num + 1;
        Function<Integer, Integer> doubleIt = num -> num * 2;

        int num = 100;
        int result = incrementor
                .andThen(square)
                .andThen(doubleIt)
                .apply(num);
        System.out.println(result);

        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        adder.apply(10, 12);
    }
}

