package Lesson2;

import java.util.Scanner;

public class LogicalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = input.nextLine();

        System.out.println("Hello Dear " + name + "!");
        System.out.println();
        System.out.println(name + ", how are you today?");

        System.out.println("Do You have a Job? Y or N:");
        String answer = input.nextLine();
        System.out.println("Are you Hardworking? Y or N:");
        String answer2 = input.nextLine();


        if (answer2.equalsIgnoreCase("yes") && answer.equalsIgnoreCase("yes")) System.out.println("Congrats");
        else System.out.println("Do you want to work with us?");

    }
}
