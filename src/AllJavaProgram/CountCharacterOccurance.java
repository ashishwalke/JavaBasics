package AllJavaProgram;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s= "Java Programming Java oops";
		
		int totalcount= s.length(); //total len 5
		
		int totalcount_afterRemove = s.replace("a","").length(); //Total len after removing a
		
		int count= totalcount-totalcount_afterRemove;
		
		System.out.println("Number occurances of a is : " +count);
		

	}

}
