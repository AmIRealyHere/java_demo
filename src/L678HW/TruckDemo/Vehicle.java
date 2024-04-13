package L678HW.TruckDemo;


public class Vehicle {
    private int passengers; // количество пассажиров
    private int fuelcap; // емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон
    // Это конструктор класса Vehicle
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    // Определить дальность поездки транспортного средства
    int range () {
        return mpg * fuelcap;
    }
    // Рассчитать объем топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
    int getPassengers() {return passengers;}
    void setPassengers(int p){passengers = p;}
    int getFuelcap() {return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }

}