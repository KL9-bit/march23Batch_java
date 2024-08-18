package logicprograms;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		//int a=10;
		//int b=20;
		//int sum=a+b;
		//System.out.println("addition is ="+sum);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st your number");
		int a= sc.nextInt();
		System.out.println("enter 2nd your number");
	int b= sc.nextInt();

	int sum= a+b;
	System.out.println("sum is = "+sum);
	
	int sub=a-b;
	System.out.println("subtraction is "+sub);
	
	int mul=a*b;
	System.out.println("multiplication is = "+mul);
	
int div= a/b;
System.out.println("division is ="+div);
	
	sc.close();
	}

}

