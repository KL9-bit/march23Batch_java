package patternsProgram;

public class Eg13 {
	public static void main(String[] args) {
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
	
		int row=9;
		int star1=1;
		int star2=1;
		int space1=5;
		int space2=4;
		
		//outer for loop
		for(int i=1;i<=row;i++)
		{//inner for loop for star1
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
				
			}
			//for loop for star1
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			//for loop for space2
			for(int l=1;l<=space2;l++)
			{
			System.out.print(" ");	
			}
			//for loop for star2
			for(int m=1;m<=star2;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				space1--;
				star1++;
				space2--;
				star2++;
				
			}
			else {
				space1++;
				star1--;
				space2++;
				star2--;
			}
		}
	}
	}