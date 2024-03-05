package SingleInheritance;

public class Restaurant {
    String name;

    public void welcome() {
        System.out.println("Welcome to " + name + " restaurant!");
    }

    public void serveFood() {
        System.out.println(name + " is serving food.");
    }
}

