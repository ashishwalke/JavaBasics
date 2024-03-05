package Polymor;

public class MethodOverloadingExample {

	public void MoveSpeed(String Car) {
		System.out.println("Slow");
	}

	public void MoveSpeed(double Car) {
		System.out.println("Fast");
	}

	public void MoveSpeed(int Train) {
		System.out.println("Very Fast");
	}

	public void MoveSpeed(int Train, String Airplane) {
		System.out.println("Fast and Very Fast");
	}

	public static void main(String[] args) {

		MethodOverloadingExample overload = new MethodOverloadingExample();
		overload.MoveSpeed("Kia");
		overload.MoveSpeed(5.2);
		overload.MoveSpeed(100);
		overload.MoveSpeed(1000, "AirIndia");
	}

}
