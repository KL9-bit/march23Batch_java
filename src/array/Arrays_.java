package array;

import java.util.Arrays;

public class Arrays_ {

	public static void main(String[] args) {
	

		int number[]=new int[6];
		
		number[0]=3;
		number[1]=4;
		number[2]=5;
		number[3]=2;
		number[4]=1;
		number[5]=6;
		
		
	/*	System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println(number[5]);
		System.out.println(number[0]);
	*/
		
		System.out.println("=================dynamic =========================");
		
		Arrays.sort(number);
		
		for(int i=0; i<=5;i++)
		{
			System.out.println(number[i]);
			
		}
		
		System.out.println("==============Arrays.sort(numbers);// to sort our Array================");
		
		int[] numbers=new int[5];
		numbers[0]=4;
		numbers[1]=1;
		numbers[2]=5;
		numbers[3]=3;
		numbers[4]=2;
		
		Arrays.sort(numbers);
		for(int s=0; s<=numbers.length-1;s++)
		{
			
			System.out.println(numbers[s]);
		}
		
		System.out.println("=================for loop =========================");
		
		for(int i=5;i>=0;i--)
		{
			
			System.out.println(number[i]);
			
			
		}
		System.out.println("===================index=======================");
		
		float age[]= {23.5f,35.4f,32.6f,25.9f};
		
		System.out.println(age[2]);
		
		Arrays.sort(age);
		
		
		System.out.println("=================float for loop accending=========================");
		
		for(int i=0; i<=3;i++) {
			
			System.out.println(age[i]);
		}		

		System.out.println("==========================================");
		
		
		for(int i=0; i<=age.length-1;i++) { // arrayname.length(which is one of Strings method)-1
			
			System.out.println(age[i]);
		}
		
		
System.out.println("==============Arrays.sort(numbers);// to sort our Array================");
		
		
		
		float[] agee=new float[6];
		
		agee[0]=18.0f;
		agee[1]=26.3f;
		agee[2]=19.0f;
		agee[3]=18.7f;
		agee[4]=00.00f;
		agee[5]=22.0f;
		
		
		Arrays.sort(agee);
		for(int p=0;p<=agee.length-1;p++)
		{
			
			System.out.println(agee[p]);
		}
		
		
	}

}
