package logicprograms;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("given nuumber is even");	
		}else
		{
			System.out.println("given number is odd");
		}
		sc.close();		
	}
}
