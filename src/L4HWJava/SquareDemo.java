package L4HWJava;
import java.util.Scanner;
public class SquareDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int sideLength = scanner.nextInt();

        scanner.close();

        Square square = new Square(sideLength);

        System.out.println("Area of the square: " + square.calculateArea());
    }
}