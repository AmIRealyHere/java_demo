package Bro;

public class CarAbstract extends VehicleAbstract{

    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }
}
