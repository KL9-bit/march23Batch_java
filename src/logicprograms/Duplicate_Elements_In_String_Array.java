package logicprograms;

public class Duplicate_Elements_In_String_Array {
public static void main(String[] args) {
	
	String ar[]= {"java","sql","oops","java","sql","oops","selenium"};
	int count=0;
	
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]==ar[j]) {
				System.out.print(ar[i]+" ");
				count++;
			}
		}
		
	}
System.out.println();
System.out.println("total number of count = " +count);
}
}
