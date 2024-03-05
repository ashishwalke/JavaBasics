package Polymor;

public class MethodOverridingExample {
	
	String company;
	String model;
	
	public void startEngine() {
		System.out.println("Engine Started For Car :" +company+ " and Model : " +model);
	}
	
	public void applyBrake() {
		System.out.println("Brakes Applie : " +company+  " and model : " +model);
	}
}

