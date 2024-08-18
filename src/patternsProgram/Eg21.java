package patternsProgram;

public class Eg21 {
	public static void main(String[] args) {
		
		
		//*   *
		//*   *
		//*****
		//*   *
		//*   *
		
		int row=5;
		 
		for(int i=1; i<=row;i++)
		{
			
			for(int j=1;j<=5;j++) 
			if(i==3||j==1||j==5) {
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
