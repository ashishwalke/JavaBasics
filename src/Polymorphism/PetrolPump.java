package Polymorphism;

public class PetrolPump {

    public void refuelVehicle(String vehicleType) {
        System.out.println("Refueling " + vehicleType + " with Regular Petrol");
    }

    public void refuelVehicle(String vehicleType, String fuelType) {
        System.out.println("Refueling " + vehicleType + " with " + fuelType);
    }

    public void refuelVehicle(String vehicleType, double fuelAmount) {
        System.out.println("Refueling " + vehicleType + " with " + fuelAmount + " liters");
    }

    public void refuelVehicle(String vehicleType, String fuelType, int fuelAmount) {
        System.out.println("Refueling " + vehicleType + " with " + fuelAmount + " liters of " + fuelType);
    }

    public static void main(String[] args) {

    	PetrolPump pump = new PetrolPump();
    	pump.refuelVehicle("Car");
    	pump.refuelVehicle("Truck", "Diesel");
    	pump.refuelVehicle("Motorcycle", 10.5);
    	pump.refuelVehicle("Scooter", "Premium Petrol", 500);
    }
}