package L3HWJava;

import java.util.Scanner;

public class FactorPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.printf("The number %d is a product of:\n", number);
        boolean hasFactors = false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                hasFactors = true;
                int factor1 = i;
                int factor2 = number / i;
                System.out.printf("%d and %d\n", factor1, factor2);
            }
        }

        if (!hasFactors) {
            System.out.printf("The number %d has no multipliers, so it is a prime number. "
                    + "A prime number is a natural number greater than 1 "
                    + "that is not a product of two smaller natural numbers.\n", number);
        }

        scanner.close();
    }
}
