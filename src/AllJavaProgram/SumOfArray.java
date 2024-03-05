package AllJavaProgram;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {5,2,7,9,6};  //n-5    n-1=4
		
		int sum=0;
		
		/*for(int i=0; i<=a.length-1; i++) {
			
			sum=sum+a[i];  //5+2+7+9+6
		}*/
		
		//Enhanced for loop
		for(int value:a) {
			
			sum=sum+value;
		}
		
		System.out.println("Sum of Array elements : " +sum);

	}

}
