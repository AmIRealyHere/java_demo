package Lesson8;

public class OverloadDemo {
    public static void main(String[] args) {
      OverloadDemo myObj = new OverloadDemo();
      myObj.printHello("Marry");
      myObj.printHello(1);
    }
    void printHello(){
        System.out.println("Hello!");
    }
    void printHello(String name) {
        System.out.println("Hello " + name + " !");
    }
    void printHello(int day) {
        System.out.println("Hello on this " + day + " !");
    }
}
