package Practice;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Calculation with recursive method");
        System.out.println("Factorial of 3 equals: " + f.factR(3));
        System.out.println("Factorial of 4 equals: " + f.factR(4));
        System.out.println("Factorial of 5 equals: " + f.factR(5));
        System.out.println();

        System.out.println("Calculation with iterative method");
        System.out.println("Factorial of 3 equals: " + f.factI(3));
        System.out.println("Factorial of 4 equals: " + f.factI(4));
        System.out.println("Factorial of 5 equals: " + f.factI(5));
    }
}
