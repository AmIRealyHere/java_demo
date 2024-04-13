package Lesson11;

import Lesson6.ArrayUtils;

public class AbstractDemo {
    public static void main(String[] args) {
        Triangle one = new Triangle();

        TwoDimensionShape[] shapes = new TwoDimensionShape[4];

        shapes[0] = new Triangle("contour", 8.0, 12.0);
        shapes[1] = new Rectangle(10.0,12.0);
        shapes[2] = new Rectangle(4);
        shapes[3] = new Triangle(7.0);

        ArrayUtils.printArray(shapes);
        ErrorMessage err = new ErrorMessage();

        System.out.println(err.getErrorMessage(err.DISKERR));
        System.out.println(err.getErrorMessage(err.OUTERR));
        System.out.println(err.getErrorMessage(err.INNERR));

    }
}
