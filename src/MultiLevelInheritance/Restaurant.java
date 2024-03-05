package MultiLevelInheritance;

//Define the base class Restaurant
public class Restaurant {
 String name;

 public void welcomeCustomers() {
     System.out.println("Welcome to " + name + " restaurant!");
 }

 public void serveFood() {
     System.out.println(name + " is serving food.");
 }
}

