package JavaPracticeCode;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfCharacter {
	public static void main(String[]args) {
		
		String str= "hello world";
		
		Map<Character, Integer> count= new HashMap<>();
		
		for(char c:str.toCharArray()) {
			
			if(count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			}else {
				count.put(c,1);
			}
			
			
		}
		
		for(Map.Entry<Character,Integer> entry :count.entrySet()) {
			System.out.println("Character " +entry.getKey() +" Occurs " +entry.getValue()+ " times");
		}
	}

}
