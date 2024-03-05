package MultiLevelInheritance;

//Create another subclass PizzaPlace that extends ItalianRestaurant
public class PizzaPlace extends ItalianRestaurant1 {
	public void serveBeverages() {
		System.out.println(name + " is serving beverages.");
	}

	public void offerDelivery() {
		System.out.println(name + " offers delivery service.");
	}

	public static void main(String[] args) {
		// Created an object of PizzaPlace
		PizzaPlace myPizzaPlace = new PizzaPlace();

		// Attribute inherited from the superclass named Restaurant
		myPizzaPlace.name = "Pizza Palace";

		// Method inherited from the superclass named Restaurant
		myPizzaPlace.welcomeCustomers();
		myPizzaPlace.serveFood();

		// Method inherited from the subclass1 named ItalianRestaurant
		myPizzaPlace.makePizza();
		myPizzaPlace.preparePasta();

		// Method created in this subclass is used
		myPizzaPlace.serveBeverages();
		myPizzaPlace.offerDelivery();
	}
}