package VehicleHierarchy;

public class Vehicle {

	String make;
    String model;

    public void startEngine() {
        System.out.println("Engine started for " + make + " " + model);
    }

    public void applyBrake() {
        System.out.println("Brakes applied for " + make + " " + model);
    }
}
