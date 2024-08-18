package logicprograms;

public class Duplicate_Elements_In_Int_Array {
	
	public static void main(String[] args) {
	
	
	int	ar[]= {5,7,6,3,5,9,7,3,6,4,2,1,9};
	int count=0;
	System.out.println("Duplicate elements are: ");
	for(int i=0;i<ar.length;i++) //i=0->5
	{
		for(int j=i+1;j<ar.length;j++)//j=1->7
		{
			if(ar[i]==ar[j]) 
			{
				System.out.print(ar[i]+" ");
				count++;
			}
			
		}
	}
	System.out.println();
	System.out.println("Number of Duplicate elements are = "+count);
		
		
		
	}
	

}
