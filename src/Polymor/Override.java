package Polymor;


public class Override extends MethodOverridingExample {
	
	 // applyBrake method of class MethodOverridingExample is overridden in this class
	 
	public void applyBrake() {
		System.out.println("car stopped after brake applied");
	}
	
	public static void main(String[] args) {
		Override override = new Override();
		
		// Attribute inherited from Super class named MethodOverridingExample
		override.company="Toyoto";
		override.model="Camery";
		override.startEngine();
		override.applyBrake();
		
	}
}