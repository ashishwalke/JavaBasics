package JavaPrograms;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		
		set.add("V");
		set.add("P");
		set.add("K");
		set.add(4);
		set.add(null);
		set.add("K");
		
		System.out.println(set);
		System.out.println(set.add("V"));
		System.out.println(set.add("L"));
		System.out.println(set);

	}

}

//The underlying data structure is HashTable
//Insertion order is not preseverd






//It is a implemented class of Set
//The underlying data structure is HasTable
//Duplicate’s are not allowed if we’re are inserting we won’t get any compiletime ir Runtime exception,add method simply returns false
//Insertion order is not preserved all object‘s will be inserted based on hash-code of objects.
//Heterogenius objects are allowed 
//Null insertion is possible
// HashSet is best choice ,if our frequent operation is searching 

