package AllJavaProgram;

import java.util.Scanner;

public class CountSumOfDigits {

	public static void main(String args[]) {

		// int num=12345;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;
		}

		System.out.println("Sum of digits in a number : " + sum);
	}

}
