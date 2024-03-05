package SingleInheritance;

public class ItalianRestaurant extends Restaurant {

    // Method created in this subclass
    public void makePizza() {
        System.out.println(name + " is making pizza.");
    }

    public void preparePasta() {
        System.out.println(name + " is preparing pasta.");
    }

    public static void main(String[] args) {
        ItalianRestaurant myItalianRestaurant = new ItalianRestaurant();

        // Attribute inherited from the superclass named Restaurant
        myItalianRestaurant.name = "Mama Mia's";

        // Method inherited from the superclass named Restaurant
        myItalianRestaurant.welcome();
        myItalianRestaurant.serveFood();

        // Method created in this subclass is used
        myItalianRestaurant.makePizza();
        myItalianRestaurant.preparePasta();
    }
}
