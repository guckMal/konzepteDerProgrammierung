package VorOrtEx4;

public class FleetDemo {
    public static void main(String[] args) {
        Truck truck = new Truck("T1", 5000);
        EVan evan = new EVan("E1", 3000);

        double distance = 300;

        System.out.println("== Before ==");
        System.out.println("Truck can reach 300 km? " + ((Refuelable) truck).canReach(distance));
        System.out.println("EVan can reach 300 km? " + (evan.getRange() >= distance));

        ((Refuelable) truck).refuel(50); // simulate refueling
        evan.charge(30); // simulate charging

        System.out.println("\n== After Refuel/Charge ==");
        System.out.println("Truck can reach 300 km? " + ((Refuelable) truck).canReach(distance));
        System.out.println("EVan can reach 300 km? " + (evan.getRange() >= distance));

        System.out.println("\nTruck fuel level: " + ((Refuelable) truck).getFuelLevel());
        System.out.println("EVan battery level: " + evan.getBatteryLevel());
    }
}
