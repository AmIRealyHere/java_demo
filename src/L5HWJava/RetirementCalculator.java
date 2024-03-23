package L5HWJava;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (m/f): ");
        String gender = scanner.nextLine().toLowerCase();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.println(calculateYearsToRetirement(gender, birthYear));

        scanner.close();
    }

    public static String calculateYearsToRetirement(String gender, int birthYear) {
        int currentYear = LocalDate.now().getYear();
        int retirementAge;

        if (gender.equals("m")) {
            retirementAge = 70;
        } else if (gender.equals("f")) {
            retirementAge = 65;
        } else {
            return "Invalid gender input";
        }

        int yearsToRetirement = retirementAge - (currentYear - birthYear);

        if (yearsToRetirement > 0) {
            return "Years left until retirement: " + yearsToRetirement;
        } else if (yearsToRetirement == 0) {
            return "Congratulations! You are retiring this year!";
        } else {
            return "Years since retirement: " + (-yearsToRetirement);
        }
    }
}
