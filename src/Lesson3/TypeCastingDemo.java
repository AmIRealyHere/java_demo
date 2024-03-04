package Lesson3;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int i;
        float f;
        long L;
        double D;

// i = 10;
// f = i;
        f = 10.5f;
        i = (int) f;
        System.out.println("i and f: " + i + "  " + f);

        D = 100123285;
        L = (long) D;

        System.out.println("L and D: " + L + "  " + D);
    }
}
