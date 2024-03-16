package L3HWJava;

public class ExampleBreak {
    public static void main(String[] args) {

        int x = 0; // Placeholder for the value of x
        int y = 0;

        // Define the boolean variable outside the loop
        boolean running;

        for (int i = 0; i < 10; i++) {
            running = true; // Initialize running to true for each iteration of the outer loop

            while (running) {
                if (x < y) {
                    break;
                }
                // Perform some actions inside the while loop
                // For example, calculate the sum of x and y
                int sum = x + y;
                System.out.println("Sum of x and y: " + sum);

                // Update x and y, for example
                x++;
                y--;

                // Update the running variable based on some condition
                running = false; // For example, you may want to update running based on certain conditions
            }

            // Actions after the while loop
            System.out.println("After while");
        }

        // Actions after the for loop
        System.out.println("After for");
    }
}
