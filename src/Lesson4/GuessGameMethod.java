package Lesson4;

import java.util.Scanner;

public class GuessGameMethod {
    public void GuessTheLetter(char theLetter){
        char ch;
        boolean wantToContinue = false;

        System.out.println("A letter from diapason A-Z should be guessed");
        System.out.println("Try it!");
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your char:");
            ch = input.nextLine().charAt(0);
            if (ch == theLetter) {
                System.out.println("You are right!");
                wantToContinue = false;
            } else {
                System.out.println("Sorry letter is closer to the ");
                if (ch < theLetter) {
                    System.out.println("end of alphabet. ");
                } else {
                    System.out.println("begining of alphabet.");
                }

                System.out.println("Do you want to try again? Enter Y for yes");
                ch = input.nextLine().charAt(0);
                if (ch == 'y') wantToContinue = true;
            }
        } while (wantToContinue);
        System.out.println("Good Buy?");

}}
