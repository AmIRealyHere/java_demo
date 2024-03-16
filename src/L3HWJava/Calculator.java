package L3HWJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (type 'done' when finished):");

        double sum = 0;
        int count = 0;
        double average = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        while (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            sum += number;
            count++;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        if (count > 0) {
            average = sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
