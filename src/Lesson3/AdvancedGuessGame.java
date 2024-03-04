package Lesson3;

import java.util.Scanner;

public class AdvancedGuessGame {

    public static void main(String[] args) {

                char ch, answer = 'M';
                System.out.println("A letter from diapason A -Z should be guessed");
                System.out.println("Try it!");

                Scanner input = new Scanner(System.in);

                System.out.println("Enter your char:");
                ch = input.nextLine().charAt(0);

                if (ch == answer) {
                    System.out.println("You are right!");
                    System.out.println("You won from the first time!");
                } else {
                    System.out.println("Sorry letter is closer to:");
                    if (ch < answer) System.out.println("end of alphabet");
                }
                    System.out.println("start of alphabet");
                }

            }

