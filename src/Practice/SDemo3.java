package Practice;

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside of Constructor");

        System.out.println("Square root of 2 is equal to " +StaticBlock.rootOf2);
        System.out.println("Square root of 3 is equal to " +StaticBlock.rootOf3);
    }
}
