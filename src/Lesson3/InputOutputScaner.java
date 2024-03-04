package Lesson3;

import java.io.IOException;
import java.util.Scanner;

public class InputOutputScaner {
    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your char:");
        char ch1 = input.nextLine().charAt(0);

        System.out.println("You have pressed: " +ch1);
    }
}

