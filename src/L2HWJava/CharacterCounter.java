package L2HWJava;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter char (enter . to stop):");

        int spaceCount = 0;
        boolean stop = false;

        while (!stop && scanner.hasNextLine()){
            String input = scanner.nextLine();

            for (int i = 0; i< input.length(); i++){
                char inputChar = input.charAt(i);

                if (inputChar== '.'){
                    stop = true;
                    break;
                }
                if (inputChar == ' '){
                    spaceCount++;
                }
            }
        }
        System.out.println("Number of spaces: " + spaceCount);
    }
}
