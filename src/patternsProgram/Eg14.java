package patternsProgram;



public class Eg14 {

	public static void main(String[] args) {

		//    *
		//   * *
		//  * * *
		// * * * *
		//* * * * *
		// * * * *
		//  * * *
		//   * *
		//    *
		int row=9;
		int space=4;
		int star=1;
		
		for(int i=1; i<=row;i++)
		{
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<5)
			{
				space--;
				star++;
				
			}else
			{
				space++;
				star--;
			}
		}
		
	}		
}