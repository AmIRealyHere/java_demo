package Practice;

public class Shapes3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("contour", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        t1 = t2;

            System.out.println("Info about t1: ");
            t1.showStyle();
            t1.showDim();
            System.out.println("Area - " + t1.area());
            System.out.println();

            System.out.println("Info about t2: ");
            t2.showStyle();
            t2.showDim();
            System.out.println("Area - " + t2.area());
            System.out.println();

        System.out.println("Info about t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area - " + t3.area());
        System.out.println();
    }
}

