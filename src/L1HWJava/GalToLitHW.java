package L1HWJava;
import java.util.Scanner;

public class GalToLitHW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the volume in gallons: ");

        double gallons = scanner.nextDouble();
        double liters = gallons * 3.7854;

        System.out.println(gallons + " gallons is equivalent to " + liters + " liters");
    }
}