package Bro;

public class CopyObjectDemo {
    public static void main(String[] args) {

        CarCopyObject car1 = new CarCopyObject("Chevrolet", "Camaro",2021);
//        CarCopyObject car2 = new CarCopyObject("Ford","Mustang",2022);
//
//        car2.copy(car1);

        CarCopyObject car2 = new CarCopyObject(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
