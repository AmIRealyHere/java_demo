package Lesson3;

public class ForDemo {
    public static void main(String[] args) {


        double num, sqroot, rerr;

        for (num = 1.0; num < 100.00; num++) {
            sqroot = Math.sqrt(num);
            System.out.println("Square root from " + num + "is equal to" + sqroot);
            rerr = num - (sqroot * sqroot);
            System.out.println("Rounding error is equal to " + rerr);
            System.out.println();
        }
    }}
