package JavaPrograms;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("A");
		set.add("N");
		set.add("E");
		set.add("A");
		set.add(null);
		set.add(6);
		
		System.out.println(set);
		System.out.println(set.add("A"));
		System.out.println(set.contains(null));
		System.out.println(set.equals(set));
		System.out.println(set.size());
		System.out.println(set.isEmpty());

	}

}

//It is the child class of HashSet,It is exactly same as HashSet(Including methods).Except the following difference.
//The underlying data Structure is a combination of linked List and HashTable
//Insertion order is preserved
