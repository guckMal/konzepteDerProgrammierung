package VorOrtEx4;

public class EVan extends Vehicle implements Electrified {
    private double batteryLevel;

    public EVan(String id, double maxLoad) {
        super(id, maxLoad);
        this.batteryLevel = MAX_BATTERY_KWH; // Full battery initially
    }

    @Override
    public double getRange() {
        return batteryLevel / 0.25; // 0.25 kWh/km
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance * 0.25;
    }

    @Override
    public void charge(double kWh) {
        this.batteryLevel += kWh;
        if (this.batteryLevel > MAX_BATTERY_KWH)
            this.batteryLevel = MAX_BATTERY_KWH;
    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }
}
