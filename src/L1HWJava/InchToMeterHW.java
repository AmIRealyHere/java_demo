package L1HWJava;

public class InchToMeter {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 12 * 12; inches++) {
            meters = inches / 39.37; // Conversion from inches to meters
            System.out.println(inches + " inches is equivalent to " +
                    meters + " meters.");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
