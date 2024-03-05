package AnimalHierarchy;

public class Parrot extends Bird {
    String featherColor;

    public void talk() {
        System.out.println(species + " is talking.");
    }

    public void displayFeatherColor() {
        System.out.println(species + " has " + featherColor + " feathers.");
    }
    
    public static void main(String[] args) {
    	
    	Parrot myParrot = new Parrot();
    	
    	// Attribute inherited from Super Class named Animal
        myParrot.species = "Parrot";
        
        // Method inherited from Super Class named Animal
        myParrot.eat();
        myParrot.sleep();
        
        // Method inherited from Super Class named Bird
        myParrot.fly();
        myParrot.buildNest(); 
        
        // Attribute and Methods Created in this Sub Class is used
        myParrot.featherColor = "green";
        myParrot.talk();
        myParrot.displayFeatherColor();
      
    }
}
