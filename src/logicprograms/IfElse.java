package logicprograms;

import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	
	//when you are going to get value from user ,if the user is 18 or 18 plus then print "you can drive"
	//if user is not 18 or less than 18 then print "you need to wait for ----years"(you need to calculate between the gap 18 and users age)
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your age = ");
	int age=sc.nextInt();
	
	
	if(age>=18) {
		System.out.println("you can drive");
		
	}else{
		int n =18-age;
		System.out.println("you need to wait for "+n+ " years");
	}
	
	
	sc.close();
	
	
}
}

//write a program that takes a number from the user and generates an integer between 1 to 7.it displays the weekday name.
