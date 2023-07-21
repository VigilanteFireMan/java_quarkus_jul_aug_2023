public class LambdasSyntax {
    public static void main(String[] args) {
        Player scott = (String sport) -> System.out.println("Playing " + sport);
        scott.signUpContracts();
        scott.play("Tennis");

        Player adam = sport -> System.out.println("Playing  " + sport);
        adam.signUpContracts();
        adam.play("Cricket");

        Player mary = sport -> {
            System.out.println("Playing " + sport);
            System.out.println("Playing in tournament");
        };
        mary.play("Tennis");

        //Functional Interface
    }
}
@FunctionalInterface
interface Player {
    void play(String sport);
    //void signUpContracts();
    default void signUpContracts() {}
    static void doSomething() {}
}
