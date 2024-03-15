package L2HWJava;
import java.io.IOException;
import java.util.Scanner;

public class CC {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter characters. Press Enter to end the program.");

        int i = 0;
        char result = 'a';

        while (result != '.') {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Program terminated.");
                break;
            }

            result = input.charAt(0);

            StringBuilder output = new StringBuilder();
            for (char ch : input.toCharArray()) {
                // Check if the character is a lowercase letter
                if (ch >= 'a' && ch <= 'z') {
                    ch -= 32; // Convert to uppercase by decreasing ASCII code by 32
                }
                // Check if the character is an uppercase letter
                else if (ch >= 'A' && ch <= 'Z') {
                    ch += 32; // Convert to lowercase by increasing ASCII code by 32
                }
                output.append(ch);
            }
            System.out.println(output);
        }

        scanner.close();
    }
}
