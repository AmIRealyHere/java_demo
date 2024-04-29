package Bro;

public class PolymorphismDemo {
    public static void main(String[] args) {

        CarPolymorphism car = new CarPolymorphism();
        BicyclePolymorphism bicycle = new BicyclePolymorphism();
        BoatPolymorphism boat = new BoatPolymorphism();

        VehiclePolymorphism[] racers = {car,bicycle,boat};
/*
        car.go();
        bicycle.go();
        boat.go();
*/

        for (VehiclePolymorphism x:racers){
            x.go();
        }
    }
}
