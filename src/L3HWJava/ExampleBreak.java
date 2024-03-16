package L3HWJava;

public class ExampleBreak {
    public static void main(String[] args) {

        int x = 1; // Placeholder for the value of x
        int y = 3;

        for (int i = 0; i < 10; i++) {
            boolean running = true;

            while (running) {
                if (x == 2) {
                    running = false;
                    break;
                }

                // Perform some actions like x + y
                int sum = x + y;
                System.out.println("After while: " + sum);

                // Update x and y, for example
                x++;
                y--;
            }

            System.out.println("After for" +y);
        }
    }
}
