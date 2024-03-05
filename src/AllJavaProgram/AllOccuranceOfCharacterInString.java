package AllJavaProgram;
import java.util.HashMap;
import java.util.Map;

public class AllOccuranceOfCharacterInString {
	    
	    public static void main(String[] args) {
	        String str = "hello world";
	        
	        Map<Character, Integer> CharCount = new HashMap<>();
	        
	        // Counting occurrences of each character in the string
	        for (char c : str.toCharArray()) {
	            if (CharCount.containsKey(c)) {
	            	CharCount.put(c, CharCount.get(c) + 1);
	            } else {
	            	CharCount.put(c, 1);
	            }
	        }
	        
	        // Displaying the character occurrence count
	        for (Map.Entry<Character, Integer> entry : CharCount.entrySet()) {
	            System.out.println("Character" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
	        }
	    }
	
}
