package AllJavaProgram;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
	
		int a[]= {50,30,40,20,60,10};
		
	/*	int max=a[0];
		
		for(int i=0; i<a.length;i++) {   //40
			
			if(a[i]>max) {    //40>50
				max=a[i];    //50
			}
		}
		System.out.println("Maximum Element in array is : " +max);*/
		
		int min=a[0]; //50
		for(int i=0; i<a.length;i++) {    //2
			
			if(a[i]<min) {    //40<50    20<40....
				
				min=a[i];  //40   20...
			}
		}
		
		System.out.println("Minimum Element in array is : " +min);

	}

}
