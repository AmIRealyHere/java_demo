package Bro;

public class Array {
    public static void main(String[] args) {
//        String[] cars = new String[3];
//
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Tesla";
//
//        for (int i =0; i< cars.length; i++){
//            System.out.println(cars[i]);

        char[] cars = new char[26];


        for (int i = 0; i < cars.length; i++) {
            cars[i] = (char) ('a' + i);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
