package L5HWJava;

import java.util.Scanner;

public class ExamGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        String grade = calculateGrade(score);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
