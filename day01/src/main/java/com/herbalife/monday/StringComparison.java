package com.herbalife.monday;

public class StringComparison {
    public static void main(String[] args) {
        String language1 = "Java";
        String language2 = new String("Java");
        if (language1 == language2) {
            System.out.println("language1 and language2 are equal");
        } else {
            System.out.println("language1 and language2 are not equal");
        }
        if(language1.equals(language2)) {
            System.out.println("language1 and language2 are similar");
        }

        //Stick to one way of creating strings in your application
        //Use .equals method to compare the values
    }
}
