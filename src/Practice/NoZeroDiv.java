package Practice;

public class NoZeroDiv {
    public static void main(String[] args) {
        int result;
        for (int i = -5; i < 6; i++) {
// Деление на нуль предотвращается
            result = i != 0 ? 100 / i : 0;
            if (i != 0)
                System.out.println("1OO /" + i + " равно " + result);
        }
    }
}