package Bro;

public class VehicleDemo {
    public static void main(String[] args) {

        Car2 car = new Car2();

        car.go();
        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
