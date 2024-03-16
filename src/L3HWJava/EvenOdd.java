package L3HWJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.printf("%d is even.\n", number);
        } else {
            System.out.printf("%d is odd.\n", number);
        }

        scanner.close();
    }
}
