package L2HWJava;
import java.io.IOException;
import java.util.Scanner;

public class ChangeCase {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter characters. Press Enter to terminate the program.");

        int i = 0;
        String input = " ";

        while (!input.isEmpty()) {
            input = scanner.nextLine();

            StringBuilder output = new StringBuilder();
                for (char ch : input.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
                }
                else if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                }
            output.append(ch);
            }
            System.out.println(output);
        }
        System.out.println("Program terminated.");
        scanner.close();
    }
}
