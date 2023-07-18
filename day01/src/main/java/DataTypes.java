import java.util.ArrayList;

public class DataTypes {
    public static void main(String[] args) {
        //Primitive types (stored on the stack)
        byte b = 12;
        int i = 10;
        long number = 12L;
        float decimal = 12.234f;
        double pi = 3.14d;
        char letter = 'A';
        boolean status = true;

        //Reference types (stored on the heap; have references from stack)
        String name = "Sam";
        ArrayList languages = new ArrayList();
        Object obj = new Object();
    }
}
