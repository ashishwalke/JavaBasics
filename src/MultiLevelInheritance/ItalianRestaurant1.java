package MultiLevelInheritance;

//Created a subclass ItalianRestaurant that extends Restaurant

public class ItalianRestaurant1 extends Restaurant {
	public void makePizza() {
		System.out.println(name + " is making pizza.");
	}

	public void preparePasta() {
		System.out.println(name + " is preparing pasta.");
	}
}