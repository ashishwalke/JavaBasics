package VehicleHierarchy;

public class LuxuryCar extends Car {
    String specialFeature;

    public void displaySpecialFeature() {
        System.out.println("Luxury car " + make + " " + model + " has a special feature: " + specialFeature);
    }

    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.make = "Mercedes";
        luxuryCar.model = "S-Class";
        luxuryCar.specialFeature = "Massaging seats";
        luxuryCar.startEngine();
        luxuryCar.applyBrake();
        luxuryCar.accelerate();
        luxuryCar.displaySpecialFeature();
    }
}
