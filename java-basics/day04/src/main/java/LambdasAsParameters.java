public class LambdasAsParameters {
    public static void main(String[] args) {
        Worker coder = () -> System.out.println("I write code");
        doSomething(coder);

        Worker salesRep = () -> System.out.println("I sell medicines");
        doSomething(salesRep);

        doSomething(() -> System.out.println("I sleep everyday"));
        doSomething(() -> System.out.println("I am on Netflix the whole day"));
        doSomething(() -> {
            System.out.println("I eat");
            System.out.println("I sleep");
            System.out.println("I snore");
        });
    }

    static Worker createARobotVaccum() {
        return () -> {
            System.out.println("I am shark ninja");
            System.out.println("Program me");
        };
    }

    static void doSomething(Worker worker) {
        worker.work();
    }
}

interface Worker {
    void work();
}
