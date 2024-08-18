package patternsProgram;

public class Eg16 {

	public static void main(String[] args) {
	//	* * * * * * * 
	//	 * * * * * * 
	//	  * * * * * 
	//     * * * * 
	//	    * * * 
	//	     * * 
	//	      * 
	//	     * * 
	//      * * * 
	// 	   * * * * 
	//	  * * * * * 
	//	 * * * * * * 
	//	* * * * * * * 

		int row=7;
		int star1=7;
		int space1=0;
		int row1=6;
		int star2=2;
		int space2=5;
		
		for(int i=1; i<=row;i++)
		{
		   for(int j=1; j<=space1;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=star1;k++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
		   space1++;
		   star1--;
			
		}
		for(int x=1;x<=row1;x++)
		{
			for(int y=1;y<=space2;y++)
			{
			System.out.print(" ");
			}
			for(int z=1;z<=star2;z++)
			{
				System.err.print("* ");
			}
			System.out.println();
			space2--;
			star2++;
		}
		
	}
}