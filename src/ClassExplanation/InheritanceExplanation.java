package ClassExplanation;

public class InheritanceExplanation extends ClassExplanation {
	
	public void accelerate() {
		System.out.println("Car of : " +company+ " and model :" +model+ " is able to acelerate");
	}

	public static void main(String[] args) {
		
		InheritanceExplanation accCar = new InheritanceExplanation();
		accCar.company="Maruti";
		accCar.model="Ertiga";
		accCar.startEngine();
		accCar.applyBrake();
		accCar.accelerate();
		

	}

}
