package AllJavaProgram;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before swapping values are : "+a+"   "+b );
		
		//Logiv1 : By using Third Variable
		
		/*int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping values are.."+a+"    "+b);*/
		
		//Logic 2 : Use + & - operator without using third variable
		
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		System.out.println("After Swapping values are.."+a+"    "+b);
		
		//Logic 3 Use * and / without using third variable 
		//here a and b values should not be zero
		
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		
		//Logic 4 - Bitwise XOR(^)
		a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20
		
		//Logic 5 - Single Statement
		
		b=a+b-(a=b);
		System.out.println("After swapping values are : "+a+"   "+b);
		
	}

}
