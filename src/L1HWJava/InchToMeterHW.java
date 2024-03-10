package L1HWJava;

public class InchToMeterHW {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 12 * 12; inches++) {
            meters = inches / 39.37;
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
