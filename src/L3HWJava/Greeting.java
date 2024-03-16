package L3HWJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a language (rus, rom, eng, dutch):");
        String language = scanner.nextLine();

        switch (language) {
            case "rus":
                System.out.println("Привет!");
                break;
            case "rom":
                System.out.println("Bună ziua!");
                break;
            case "eng":
                System.out.println("Hello!");
                break;
            case "dutch":
                System.out.println("Hallo!");
                break;
            default:
                System.out.println("Sorry, language not supported.");
        }

        scanner.close();
    }
}
