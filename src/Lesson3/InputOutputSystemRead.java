package Lesson3;

import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

//        System.out.println("Press any button, then press [Enter]:");
//        char ch = (char) System.in.read();
//
//        System.out.println("You have pressed: " +ch);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        char ch1 = input.nextLine().charAt(0);
        
        System.out.println("You have pressed: " +ch1);
    }
}

