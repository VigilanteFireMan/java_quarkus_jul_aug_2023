import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Double> randomFuture = executorService.submit(() -> {
            int count = 0;
            while(count < 5) {
                count++;
                System.out.println("Generating random number ...");
                MyThreadUtil.sleep(1);
            }
            System.out.println("********Completed generating the random number");
            return Math.random() * 100;
        });
        System.out.println("Random number is " + randomFuture.get());// Blocking call
        System.out.println("End of main");
    }
}
