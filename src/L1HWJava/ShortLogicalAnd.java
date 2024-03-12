package L1HWJava;

public class ShortLogicalAnd {
    public static void main(String[] args) {

        int numerator = 10;
        int divisor = 0;

        if (divisor != 0 && numerator % divisor == 0) {
        int result = numerator / divisor;
            System.out.println("Division result: " + result);
        } else {
            System.out.println("Division by zero or divisor is zero.");
        }
    }
}
