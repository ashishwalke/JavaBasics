package JavaPrograms;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("A");
		set.add("a");
		set.add("G");
		set.add("E");
		set.add("R");
		//set.add(5); ClassCastException
		set.add("Q");
		
		System.out.println(set);
		//System.out.println(set.add(new Integer(10)));//ClassCastException
		//System.out.println(set.add(null));//NullPonterException
		

	}

}



//A string object cannot be cast to an integer object and attempting to do so will result in a ClassCastException