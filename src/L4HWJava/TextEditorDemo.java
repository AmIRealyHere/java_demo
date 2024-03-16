package L4HWJava;
import java.util.Scanner;
public class TextEditorDemo {
    public static void main(String[] args) {
        // Create a TextEditor object
        TextEditor editor = new TextEditor();

        // Create Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter text
        System.out.println("Enter text to add to the current string (press Enter on an empty line to finish):");
        String inputText;

        // Loop to continue accepting input until an empty line is entered
        while (true) {
            inputText = scanner.nextLine();
            if (inputText.isEmpty()) {
                break; // Exit the loop if an empty line is entered
            }
            editor.addText(inputText); // Add the input text to the current string
        }

        // Close the scanner
        scanner.close();

        // Print the current string
        editor.printCurrentText();
    }
}