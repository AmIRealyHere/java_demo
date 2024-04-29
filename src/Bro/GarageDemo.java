package Bro;

public class GarageDemo {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car1 car1 = new Car1("BMW");
        Car1 car2 = new Car1("Toyota");
        Car1 car3 = new Car1("Lamborghini");

        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
    }
}
