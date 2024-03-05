package Object;


public class Animal {
    String species;

    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping.");
    }
}
 class Bird extends Animal {
	   
	// Method created in this subclass
	public void fly() {
        System.out.println(species + " is flying.");
    }

    public void buildNest() {
        System.out.println(species + " is building a nest.");
    }

    public static void main(String[] args) {
        Bird myBird = new Bird();
        
        // Attribute inherited from Super class named Animal
        myBird.species = "Sparrow";
        
        // Method inherited from Super Class named Animal
        myBird.eat();
        myBird.sleep();
        
        // Method created in this Sub Class is used
        myBird.fly();
        myBird.buildNest();
    }
}