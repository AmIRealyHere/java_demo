package L2HWJava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceCounter {

    public static void main(String[] args) {
        System.out.println("Press '.' to stop the program.");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = reader.readLine()) != null) {
                if (input.contains(".")) {
                    System.out.println("Program stopped.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}