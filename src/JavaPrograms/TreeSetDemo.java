package JavaPrograms;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(50);
		set.add(20);
		set.add(60);
		//set.add(null);
		set.add(40);
		set.add(90);
		set.add(40);
		
		System.out.println(set);
		System.out.println(set.ceiling(40));
		System.out.println(set.higher(50));
		System.out.println(set.floor(60));
		System.out.println(set.lower(90));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.descendingSet());
		System.out.println(set);
		

	}

}


//It is the implemented class of SortedSort
//Underlying data structure is Balance Tree
//Insertion order is not preserved
//Heterogenous object’s are not allowed,if we add will get Runtime exception (ClassCastExcption)
//Null insertion not possible
//Duplicates are not allowed
//All objects will be inserted based on some sorting order it may be default natural sorting order or customised sorting order.



//ceiling(e): returns lowest element which is >= e
//higher(e): returns lowest element which is > e
//floor(e): returns highest element which is <= e
//lower(e): returns highest element which is <e
//pollFirst(): remove and returns first element 
//pollLast(): remove and returns last element 
//descendingSet(): returns the navigable set in reverse order.


