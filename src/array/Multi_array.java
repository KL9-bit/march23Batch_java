package array;

public class Multi_array {
public static void main(String[] args) {
	
	int rollnumber[][]= {{1,9},{8,5}};
	
	for(int i=0; i<=1;i++)
	{
		for(int j=0;j<=1;j++)
		{
			System.out.print(rollnumber[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("========================================");
	
	int y[][]= {{1,4,4},{8,7,8},{3,9,4}};
	
	for(int i=0; i<=2;i++)
	{
		for(int j=0; j<=2;j++)
		{System.out.print(y[i][j]+" ");
		}
		System.out.println();
	}

	System.out.println("========================================");
	
	
   float z[][]= {{3.4f,3.0f,4.3f},{8.4f,6.4f,7.f},{6.9f,9.4f,3.3f}};
   for(int m=0;m<=2;m++)
   {
	   for(int n=0;n<=2;n++)
	   {
		   System.out.print(z[m][n]+" ");   
	   }
	   System.out.println();
   }
	
	
}
	
}
