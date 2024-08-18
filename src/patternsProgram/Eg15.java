package patternsProgram;

public class Eg15 {
	public static void main(String[] args) {
		
		//     *
		//    * *
		//   * * *
		//  * * * *
		// * * * * * 
		//* * * * * *
		
		int row=6;
		int space=5;
		int star=1;
		//outer for loop for row
		for(int i=1;i<=row;i++)
		{//inner for loop for space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			space--;
			star++;
		}
	}

}
