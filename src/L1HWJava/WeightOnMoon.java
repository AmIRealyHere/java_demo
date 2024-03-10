package L1HWJava;
import java.util.Scanner;
public class WeightOnMoon {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your weight on Earth (in kg): ");
            double weightOnEarth = scanner.nextDouble();

            double weightOnMoon = weightOnEarth * 0.17;
            System.out.println("Your weight on the Moon would be: " + weightOnMoon + " kg");

            scanner.close();
        }
    }


