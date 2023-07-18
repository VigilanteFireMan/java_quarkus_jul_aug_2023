import java.util.ArrayList;

public class ConditionalsAndLoops {
    public static void main(String[] args) {
        int i = 10;
        if (i % 2 == 0) {
            System.out.println("i is even");
        } else {
            System.out.println("i is odd");
        }

        //traditional switch-case statement
        int rem = i % 2;
        String result = "";
        switch (rem) {
            case 0:
                result = "i is even";
                break;
            case 1:
                result = "i is odd";
                break;
            default:
                result = "Weird";
        }
        System.out.println(result);

        //switch-case has become an expression
        //Introduced in Java 17
        int reminder = i % 2;
        String output = switch (reminder) { //Preferred approach; In c# 8.0
            case 0 -> "i is even";
            case 1 -> "i is odd";
            default -> "Weird number";
        };
        System.out.println(output);

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        ArrayList<Integer> numbers = new ArrayList();
        for (int j = 0; j < numbers.size(); j++) {
            System.out.println(numbers.get(j));
        }
        for (int num : numbers) {
            System.out.println(num);
        }
        numbers.forEach(num -> System.out.println(num)); //Preferred approach; java 8
        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
        do {
            System.out.println(count);
            count++;
        } while (count < 10);
    }
}
