public class MyThreadUtil {
    public static void sleep(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static String name() {
        return Thread.currentThread().getName();
    }
}
