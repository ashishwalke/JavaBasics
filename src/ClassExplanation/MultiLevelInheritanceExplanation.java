package ClassExplanation;

public class MultiLevelInheritanceExplanation extends InheritanceExplanation {
	
	String gearBoxType;
	
	public void gearBox() {
		
		System.out.println("Car of :" +company+ " and model : " +model+ " has " +gearBoxType+ " gear box");
	}
	public static void main(String[] args) {
		
		MultiLevelInheritanceExplanation gearOfCar=new MultiLevelInheritanceExplanation();
		gearOfCar.company="Hyundai";
		gearOfCar.model="Creta";
		gearOfCar.startEngine();
		gearOfCar.applyBrake();
		gearOfCar.accelerate();
		gearOfCar.gearBoxType="Automatic";
		gearOfCar.gearBox();
	}

}
