package logicprograms;

public class ReverseString {
	
	public static void main(String[]args) {

		String s="lamok edagal";
		String rev="";
         System.out.println("String is = "+s);
		for(int i=s.length()-1;i>=0;i--)
		{
		 rev =rev+s.charAt(i);
		}
		System.out.println("Reverse String is = "+rev);

		 }
		}
