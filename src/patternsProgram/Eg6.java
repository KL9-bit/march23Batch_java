package patternsProgram;

public class Eg6 {
public static void main(String[] args) {
	
	//*****
	// ****
	//  ***
	//   **
	//    *
	
	int row=5;
	int star=5;
	int space=0;
//outer for loop=row
for(int i=1; i<=row;i++)
{
	//this is inner for loop for space
for(int j=1;j<=space;j++)
{
System.out.print(" ");	
}
//this is another inner for loop 
//for star
for(int k=1; k<=star;k++)
{
System.out.print("*");	
}

System.out.println();
space++;
star--;
}
}
}