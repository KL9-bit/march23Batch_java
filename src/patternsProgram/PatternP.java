package patternsProgram;

public class PatternP {
	
	public static void main(String[] args) {
	 	
	    //*       *
		//**     **
		//***   ***
		//**** ****
		
		int row=4;
		int star1=1;
		int star2=1;
		int space1=4;
		int space=3;
		//outer for loop for row
		for(int i=1;i<=row;i++)
		{
			//inner for loop for star1
			for(int j=1; j<=star1;j++)
			{System.out.print("*");
			}
			for(int m=1;m<=space1;m++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=star2;l++)
			{
			System.out.print("*");	
			}
		System.out.println();
			star1++;
			space1--;
			star2++;
			space--;
		}
		
		
	}

}
