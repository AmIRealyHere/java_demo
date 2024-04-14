package L678HW.Circle;

public class ShapeCircle {
            public static void main(String[] args) {
            Circle circle = new Circle(3.0);
            String style = "colored";
            double area = circle.area();
            double circumference = circle.circumference();

            System.out.println("Info about circle: ");
            System.out.println();
            System.out.println("Area of the circle: " + area);
            System.out.println("Circumference of the circle: " + circumference);
        }
    }
