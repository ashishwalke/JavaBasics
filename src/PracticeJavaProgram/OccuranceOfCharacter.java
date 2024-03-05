package PracticeJavaProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		
		String str="Hello world";
		
		Map<Character,Integer> count = new HashMap<>();
		
		//Count occurance of each character in string
		
		for(char c:str.toCharArray()) {
			
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}else {
				count.put(c, 1);
			}
				
		}
	
		
		//Displaying the character occurance count 
		
		for(Map.Entry<Character, Integer> entry: count.entrySet()) {
			
			System.out.println("Character  " + entry.getKey()+  "  Occurs  "  +entry.getValue()+ " Times");
		}
		
		
		
		
		
		

}
}