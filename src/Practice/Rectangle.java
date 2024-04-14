package Practice;

public class Rectangle extends TwoDShape{
    Rectangle(double w, double h) {
        super(w, h);
    }

    boolean isSquare(){
        double width;
        if (getWidth()==getHeight()) return true;
        return false;
    }
    double area(){
        return getWidth() * getHeight();
    }
}
