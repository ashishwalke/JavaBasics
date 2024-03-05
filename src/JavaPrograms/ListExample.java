package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a new ArrayList of integers
        List<Integer> myList = new ArrayList<>();

        // Add elements to the list
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println(myList);

        // Access elements by index
        int firstElement = myList.get(0); // Returns 10
        System.out.println(firstElement);

        // Iterate over the list
        for (Integer num : myList) {
            System.out.println(num);
        }

        // Remove an element
        myList.remove(1); // Removes the element at index 1 (which is 20)
        System.out.println(myList);

        // Check if an element is present
        boolean contains30 = myList.contains(30); // Returns true
        System.out.println(contains30);

        // Get the size of the list
        int size = myList.size(); // Returns 2 (after removing 20)
        System.out.println(size);
       
    }
}