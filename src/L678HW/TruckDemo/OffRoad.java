package L678HW.TruckDemo;

class OffRoad extends Vehicle{
    private int groundClearance;

    OffRoad(int p, int f, int m, int g) {
        super(p, f, m);
        groundClearance = g;
    }
    int getGroundClearance() {return groundClearance;}
    void putGroundClearance(int g) {groundClearance=g;}
}

