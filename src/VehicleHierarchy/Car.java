package VehicleHierarchy;

public class Car extends Vehicle {
   
	public void accelerate() {
        System.out.println("Car " + make + " " + model + " is accelerating");
    }

    public static void main(String[] args) {
        Car sportsCar = new Car();
        sportsCar.make = "Ferrari";
        sportsCar.model = "488 GTB";
        sportsCar.startEngine();
        sportsCar.applyBrake();
        sportsCar.accelerate();
    }
}
