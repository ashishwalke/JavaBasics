package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add("M");
		set.add("J");
		set.add("L");
		set.add("A");
		set.add("T");
		set.add("J");
		set.add(3);
		set.add(null);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.hashCode());
		System.out.println(set.isEmpty());

	}

}
//Duplicates are not allowed & Insertion order is not preserved & Null values are allowed