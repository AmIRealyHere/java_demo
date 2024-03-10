package L1HWJava;
public class ItoMTable {
        public static void main(String[] args) {
            final double ipm = 39.37; // ipm = inches per meter
            int feet = 12;

            for (int inches = 1; inches <= feet * 12; inches++) {
                double meters = inches / ipm;
                System.out.println(inches + " inches is approximately " + meters + " meters");

                if (inches % 12 == 0) {
                    System.out.println();
                }
            }
        }
    }


