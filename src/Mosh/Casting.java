package Mosh;

public class Casting {
    public static void main(String[] args) {
        //Implicit casting
        // byte>short>int>long>float>double
//        short x = 1;
//        int y = x +2;
        double x = 1.1;
        int y = (int)x +2; // this is explicit casting
        System.out.println(y);

        String w = "1.1";
        double z = Double.parseDouble(w) +2;
        System.out.println(y);

    }
}
