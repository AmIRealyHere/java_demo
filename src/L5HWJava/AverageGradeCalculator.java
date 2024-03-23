package L5HWJava;

import java.util.Scanner;

public class AverageGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        int totalGrades = 0;
        int count = 0;

        while (count < numOfStudents) {
            System.out.print("Enter grade for student " + (count + 1) + ": ");
            int grade = scanner.nextInt();
            totalGrades += grade;
            count++;
        }

        if (numOfStudents > 0) {
            double averageGrade = (double) totalGrades / numOfStudents;
            System.out.println("Average grade in the group: " + averageGrade);
        } else {
            System.out.println("No students in the group.");
        }

        scanner.close();
    }
}
