public class MoreOnInterfaces1 {
    public static void main(String[] args) {
        Printer printerOldStyle = new PrinterImpl();
        printerOldStyle.print("old style data");

        //Why should you define a separate class in a separate file to implement an interface that has just one abstract method?
        //Anonymous inner classes
        Printer printerLatestStyle = new Printer() {
            @Override
            public void print(String data) {
                System.out.println(data);
            }
        };
        printerLatestStyle.print("Latest style data");

        Printer printerLatestStyle2 = new Printer() {
            @Override
            public void print(String data) {
                System.out.println(data);
            }
        };
        printerLatestStyle2.print("Latest style data");

        //Why should you write so many lines of plumbing code to just define the body of the interface method?
        //Lambda expressions in Java are shortcuts for anonymous inner classes for interfaces with ONE abstract method
        //Lambdas are anonymous inner classes generated during runtime
        Printer printerModernStyle = data -> System.out.println(data);
        printerModernStyle.print("Modern style data");
        System.out.println(printerModernStyle.getClass().getName());

        Greetings greetingsInEnglish = (String name, String language) -> System.out.println("I speak %s. Hello %s".formatted(language, name));
        Greetings greetingsInHindi = (String name, String language) -> System.out.println("I speak %s. Namaste %s".formatted(language, name));
        greetingsInEnglish.hello("Sam", "Texas English");
        greetingsInHindi.hello("Ram", "UP Hindi");
    }
}

interface Greetings {
    void hello(String name, String language);
}

interface Printer {
    void print(String data);
//    void printSomething();
}

class PrinterImpl implements Printer {
    @Override
    public void print(String data) {
        System.out.println(data);
    }
}
class TV {
    class Remote {}
}