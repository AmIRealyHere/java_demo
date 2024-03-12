package Lesson4;

public class ForVar {

    public static void main(String[] args) {
        int sum=0;
        int fact = 1;

        for (int i= 1; i <=5; i++ ) {
            System.out.println("now i is equal " + i);
            sum += i;
            System.out.println("now sum is equal " + sum);
            fact *= i;
            System.out.println("now fact is equal " + fact);
            System.out.println();
        }

            System.out.println("Sum is equal to " + sum);
            System.out.println("Factorial is equal to " + fact);

        }
    }

