package JavaPrograms;

import java.util.ArrayList;

public class IntArrayList {

	public static void main(String[] args) {

		// Create an ArrayList to store string objects
		ArrayList<Integer> integerList = new ArrayList<>();//Default Size 10

		// Add string objects to the ArrayList
		integerList.add(1);
		integerList.add(null);
		integerList.add(3);
		integerList.add(3);
		integerList.add(5);
		integerList.add(null);
		integerList.add(7);
		integerList.add(8);
		
		System.out.println(integerList);


	}

}
