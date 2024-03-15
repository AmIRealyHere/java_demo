package L2HWJava;

import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        System.out.println("Enter characters. Enter a period (<.>) to end the program.");

        while (true) {
            input = scanner.next().charAt(0);
            if (input == '.') {
                break;
            }
        }

        System.out.println("Program ended.");
    }
}
