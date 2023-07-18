public class WorkingWithStrings {
    public static void main(String[] args) {
        //Strings are immutable
        String language = "Java";
        language += " is cool";
        language += " and functional";

        String numbersInString = "";
        for (int i = 0; i < 10; i++) {
            numbersInString += i; //Everytime a new implicity object is created on the heap
        }
        //Use String only if you want to treat it as a constant
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());

        int attempts = 10;
        String message = "You've got it in " + attempts + " attempts"; //Old style
        System.out.println(message);

        String message2 = "You've got it in %s attempts";
        System.out.println(message2.formatted(attempts)); //Latest style
        System.out.println("Hi! My name is %s. I am %d years old".formatted("Sam", 12));

        //Text blocks or multiline strings
        String paragraph = """
        This is a paragraph.
        Title goes here.
        
        Here's the main body.
        
        Footer goes here.        
        """;
        System.out.println(paragraph);
    }
}
