package AllJavaProgram;

public class RevereseEachWordInaString {

	public static void main(String[] args) {
		
		/*String str = "Welcome To Java And Selenium"; //Original string 
		
		String[] words= str.split(" ");  //Splitting String into words
		
		String reverseString="";
		
		for(String w:words) {  
			
			String reverseword="";
			
			for(int i = w.length()-1; i>=0; i--) {
				
				reverseword = reverseword+w.charAt(i);
			}
			
			reverseString = reverseString + reverseword+ " ";  //emocleW oT avaJ
			
		}
		
		System.out.println(reverseString);*/
		
		//Approach 2 :
		
		String str= "Welcome to Java";
		
		String[] words= str.split("\\s");
		
		String reverseword = "";
		
		for (String w : words) {
			
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			
			reverseword = reverseword+sb.toString()+" ";  //emocleW oT avaJ
			
		}
		
		System.out.println(reverseword);

	}

}
