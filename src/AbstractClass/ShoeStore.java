package AbstractClass;

public abstract class ShoeStore {
	
	public String brandName="Nike";
	public String founder="Bill Bowerman and Phil Knight";
	public int year=1964;

	// abstract method
	public abstract void sellShoes();

	public abstract void Founder();

	// non abstract method or concrete method
	public void yearFounded() {
		System.out.println("This Brand is found in : " +year);
	}

}
