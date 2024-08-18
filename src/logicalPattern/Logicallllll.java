package logicalPattern;

import java.util.Scanner;

public class Logicallllll {
public static void main(String[] args) {
	
	
	//you have to get value from user end then if you are 18 or greater then 18 then print" you can drive",  
	//and if you are not  equals to 18 or less than 18 then print "you can drive after ----years" 
	
	
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the age = ");
	int age=sc.nextInt();
	
	if(age>=18) {
		System.out.println("you can drive");
			}else
			{
				int gap= 18-age;
				System.out.println("you can drive after"+gap+"years.");
				
			}
	
	sc.close();
}
}
