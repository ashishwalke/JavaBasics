package AllJavaProgram;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		
		//Approach 1 - Random
		
		/*Random rand= new Random();
		int rand_int = rand.nextInt(100);
		System.out.println(rand_int);
		
		double rand_dbl=rand.nextDouble(); //range 0.0 and less than 1.0
		System.out.println(rand_dbl);*/
		
		//Approach 2 - Math
		
		System.out.println(Math.random());
		
		//Approach 3 = Apache common-lang API
		//http://commons.apache.org/
		
		String randNum = RandomStringUtils.randomNumeric(50);
		System.out.println(randNum);
		

	}

}
