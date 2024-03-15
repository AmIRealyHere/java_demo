package L2HWJava;
import java.io.IOException;
import java.util.Scanner;

public class SpaceCounter {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter characters. Press . (period) to terminate the program.");

        int spaceCount = 0;
        StringBuilder inputBuilder = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();
            inputBuilder.append(input);

            if (input.endsWith(".")) {
                break;
            }
        }

        for (char ch : inputBuilder.toString().toCharArray()) {
            if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Space count: " + spaceCount);
        System.out.println("Program terminated.");
        scanner.close();
    }
}
