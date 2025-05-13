package VorOrtEx4;

public class Truck extends Vehicle implements Refuelable {
    private double fuelLevel;

    public Truck(String id, double maxLoad) {
        super(id, maxLoad);
        this.fuelLevel = 100; // Full tank initially
    }

    @Override
    public double getRange() {
        return fuelLevel / 0.3; // 0.3 l/km
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance * 0.3;
    }

    @Override
    public void refuel(double liters) {
        this.fuelLevel= Math.max((this.fuelLevel + liters), 100);
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}
