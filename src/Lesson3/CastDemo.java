package Lesson3;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);
        System.out.println("Integer part of result x / y:| \t \t" + i + "\t |");

        i = 100;
        b = (byte) i;
        System.out.println("Value of Byte:\t \t \t \t| " + b+ "\t |");

        i = 257;
        b = (byte) i;
        System.out.println("Value of Byte:\t \t \t \t| " + b+ "\t |");


        b = 88;
        ch = (char) b;
        System.out.println("Value of ch:\t \t \t \t| " + ch+ "\t |");
    }
}
