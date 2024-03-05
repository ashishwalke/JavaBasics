package Polymorphism;

public class Expressway extends Highway {
	int exitCount;

	@Override
	public void displayInfo() {
		System.out.println("Total No. Of Exit " + exitCount);
	}

	public static void main(String[] args) {
		
		// Created an object of Expressway
		Expressway road = new Expressway();

		// Attribute inherited from the superclass named Highway
		road.length = 500;
		road.lanes = 4;
		
		// Attribute created in this subclass is used
		road.exitCount = 6;

		road.displayInfo();
	}
}
