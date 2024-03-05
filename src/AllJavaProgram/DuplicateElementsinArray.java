package AllJavaProgram;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String arr[]= {"java","c", "c++", "python" , "java","c"};
		
		//Approach 1
		
		/*boolean flag=true;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicate Element: "+ arr[i]);
				}
				
			}
		}

		if(flag==false) {
			System.out.println("Diplicate Element not found");
		}
	}*/
	
	//Approach 2 : By Using Hash Set
	
	
	HashSet <String> langs= new HashSet();
	boolean flag= false;
	
	for(String l:arr) {
		
		if(langs.add(l)==false) {
			
			System.out.println("Found Duplicate element : " +l);
			flag=true;
			
		}
	}
	
	if(flag==false) {
		System.out.println("Not found Duplicates");
	}

	}
	}
