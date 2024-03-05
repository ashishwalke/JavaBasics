package AllJavaProgram;

import java.util.Scanner;

public class LargestOf3Numbers {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number");
		int c=sc.nextInt();
		
		//Approach 1- Logic
		
		/*if(a>b && a>c) {
			System.out.println(a+ " is a Largest Number");
		}
		
		else if(b>a && b>c) {
			System.out.println(b+ " is Largest Number");
		}
		else 
		{
			System.out.println(c+ " is largest Number");
		}
		*/
		//Approach 2 : Using Ternary Operator
		
		//int largest1=a>b?a:b;   //largest of a & b
		//int largest2= c>largest1?c:largest1;  //largest of c & largest1
		//System.out.println(largest2+" is largest Number");
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+" is largest Number");
		
	}

}
