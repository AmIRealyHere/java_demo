package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x, y;
        char operation;
        System.out.println("Enter x");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.println("Enter y");
        y = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Select operation: +, -, /, *, %");
        operation = input1.nextLine().charAt(0);
        if (operation == '+'){
            System.out.println("Sum: " + (x +y));
        } else if (operation == '-') {
            System.out.println("Subtraction: " + (x -y));
        } else if (operation == '*') {
            System.out.println("Multiplication: " + (x *y));
        } else if (operation == '/') {
            if (y != 0) {
                System.out.println(" division: " + (x / y));
            } else {
                System.out.println("Cannot divide by zero.");
            }

        } else if (operation == '%') {
            System.out.println("Module Division: " + (x % y));
        }
        else System.out.println("Unknown operation");

    }
}
