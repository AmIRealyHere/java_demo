package Bro;

import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {

        String name = "AmIReal";

//        boolean result = name.equalsIgnoreCase("amIReal");
//       int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf("A");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result =name.trim();

        String result = name.replace('m','s');
        System.out.println(result);
    }
}
