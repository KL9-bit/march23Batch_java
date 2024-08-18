package logicprograms;

public class PalindromeString {
public static void main(String[]args) {
	
	
	String s="MOM";
	String rev="";

	for(int i=s.length()-1;i>=0;i--) 
	{
		rev=rev+s.charAt(i);
		}	
	    System.out.println("original string = "+s);
		System.out.println("reverse String = "+rev);
		if(s.equals(rev)){
			System.out.println("this is palindrome." );
		}else
		{
			System.out.println("this is not palindrome.");
		}

 }	
}
