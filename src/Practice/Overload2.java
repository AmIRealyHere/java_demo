package Practice;

public class Overload2 {
    void f(int x){
        System.out.println("Inside of f(int): " + x);
    }
    void f(double x) {
        System.out.println("Inside of f(double): " + x);
    }

    void f(byte x) {
        System.out.println("Inside of f(byte): " + x);
    }
}
