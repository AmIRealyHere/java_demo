package L678HW.Circle;

public class Circle extends TwoDShape {

    private String style;
    double radius;

    Circle(double r) {
        super(r);
        radius = r;
    }
        double area() {
        return Math.PI * Math.pow(radius, 2);
    }
        double circumference(){
        return 2 * Math.PI*radius;
        }
    }
