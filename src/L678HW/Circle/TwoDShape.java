package L678HW.Circle;
// I left it how it was in the book. Just added radius for circle
public class TwoDShape {
    private double width;
    private double height;
    private double radius;


    TwoDShape(double w, double h, double r){
        width = w;
        height = h;
        radius = r;
    }
    TwoDShape(double x){
        width = height = radius= x;
    }

    double getWidth() {return width;}
    double getRadius() {return radius;}
    double getHeight() {return height;}
    void setWidth(double w) {width=w;}
    void setHeight(double h) {height=h;}
    void setRadius(double r) {radius=r;}

    void showDim(){
        System.out.println("Width and height - " + width + " and " +height);
    }
}
