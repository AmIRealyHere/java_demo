package Practice;

public class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон
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
// Рассчитать объем топлива, необходимого транспортному
// средству для преодоления заданного расстояния
        double fuelneeded(int miles) {
            return (double) miles / mpg;
        }
}