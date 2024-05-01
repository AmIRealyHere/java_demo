package Lesson13;

public interface MyInterface {
    int myMethod1();

    default void myMethod2() {
        System.out.println("It's a default method of MyInterface");
    }

    default int myMethod4(int a, int b) {
        return a + b;
    }

    static void myMethod3() {
        System.out.println("It's a static method of MyInterface");
    }

    static void myMethod5(MyInterfaceImplementation a) {
        a.myMethod1();
    }
}