package Bro;

public class EncapsulationDemo {
    public static void main(String[] args) {
        CarEncapsulation car = new CarEncapsulation("Ford","Mustang",1957);

        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
