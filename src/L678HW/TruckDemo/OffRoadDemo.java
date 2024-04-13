package L678HW.TruckDemo;

public class OffRoadDemo {
    public static void main(String[] args) {
        OffRoad classic = new OffRoad(2, 200, 7, 44);
        OffRoad pickup = new OffRoad(3, 280, 115, 20);
        double gallons;
        int dist = 252;
        gallons = classic.fuelneeded(dist);
        System.out.println("Off Road Classic has " + classic.getGroundClearance() + " inches of ground Clearance");
        System.out.println("Для преодоления " + dist + " миль OffRoad Classic требуется " +gallons + " галлонов топлива.\n");
        gallons = pickup.fuelneeded(dist);
        System.out.println("OffRoad Pickup has " + pickup.getGroundClearance() + " inches of ground Clearance");
        System.out.println("Для преодоления " + dist + " миль OffRoad пикапу требуется " + gallons + " галлонов топлива.");
    }
}

