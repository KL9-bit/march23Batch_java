package logicprograms;

import java.util.Scanner;

public class OccuranceOfCharInStringScanner {
public static void main(String[]args) {
Scanner	sc=new Scanner(System.in);
		System.out.println("Enter your String value = "); 
	String name = sc.next();
	int count=0;
	for(int i=0;i<=name.length()-1;i++) {
		char temp = name.charAt(i);
    if(temp=='o') {
    	
    	count++;
    }
    
	}
	System.out.println("Occurance of char in String is  = "+count);


	sc.close();
}


	
}
