package VorOrtEx4;

public abstract class Vehicle {
    protected String id;
    protected double maxLoad;

    public Vehicle(String id, double maxLoad) {
        this.id = id;
        this.maxLoad = maxLoad;
    }

    public abstract double getRange(); // in km
    public abstract double fuelNeeded(double distance); // in km
}
