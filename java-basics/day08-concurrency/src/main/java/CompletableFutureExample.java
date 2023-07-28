import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //Similar to Promises in JS
        CompletableFuture
                .supplyAsync(() -> {
                    int count = 0;
                    while (count < 5) {
                        count++;
                        System.out.println("Generating random number ...");
                        MyThreadUtil.sleep(1);
                    }
                    System.out.println("********Completed generating the random number");
                    return Math.random() * 100;
                }, executorService)
                .thenAccept(result -> System.out.println("Random number is " + result));

        System.out.println("End of main");
    }
}
