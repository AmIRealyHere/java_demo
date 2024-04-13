package L3HWJava;

import java.util.Scanner;

public class MultipliersFinders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = in.nextInt();

        boolean hasMultipliers = findMultipliers(number);
        if (!hasMultipliers){
            System.out.printf("The number %d has no multipliers, so its a prime number,%n", number);
            System.out.println("A prime is a prime");
        }
    }

    public static boolean findMultipliers(int number) {
        boolean hasMultipliers = false;

        for (int i =2; i<=Math.sqrt(number); i++){
            if (number % i ==0){
                int factor = number/i;
                System.out.printf("%d is a product of: %d and %d%n", number,i,factor);
                hasMultipliers = true;

            }
        }
        return hasMultipliers;
    }
}
