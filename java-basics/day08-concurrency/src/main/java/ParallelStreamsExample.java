import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        IntStream numbersStream = IntStream.range(1, 1000);

        ForkJoinPool fjp = new ForkJoinPool(80); //use the formula to determine the number of threads
        fjp.submit(() -> {
            numbersStream
                    .parallel() //by default uses ForkJoinPool that creates (number of cores - 1) threads
                    .filter(e -> {
                        System.out.println("****Filtering " + e + " on " + MyThreadUtil.name());
                        MyThreadUtil.sleep(1);
                        return e % 2 == 0;
                    })
                    .forEach(e -> {
                        System.out.println("****forEach " + e + " on " + MyThreadUtil.name());
                        MyThreadUtil.sleep(1);
                    });
        });
        MyThreadUtil.sleep(60);

    }
}
