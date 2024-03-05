package JavaPrograms;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {

		// Create an ArrayList to store string objects
		ArrayList<String> stringList = new ArrayList<>();//Default Size 10

		// Add string objects to the ArrayList
		stringList.add("Ashish");
		stringList.add("Amit");
		stringList.add("Neha");
		stringList.add("");
		stringList.add("Suraj");
		stringList.add("Soham");
		stringList.add("");
		stringList.add("Amit");

		// Access and print elements from the ArrayList
		System.out.println(stringList);

		String a = stringList.get(0);
		System.out.println(a);

		String b = stringList.remove(1);
		System.out.println(b);
		System.out.println(stringList);

		String c = stringList.set(1, "Shreya");
		System.out.println(c);
		System.out.println(stringList);

		System.out.println(stringList.size());
		System.out.println(stringList.get(2));
		stringList.add(3, "Akshay");
		System.out.println(stringList);
		System.out.println(stringList.clone());
		System.out.println(stringList.isEmpty());
		System.out.println(stringList.listIterator());
		//System.out.println(stringList.removeAll(stringList));
		System.out.println(stringList);
		System.out.println(stringList.subList(1, 4));
		System.out.println(stringList.indexOf("Soham"));
		//System.out.println(stringList.lastIndexOf(stringList));
		System.out.println(stringList.remove(1));
		System.out.println(stringList);
	
	}

}
