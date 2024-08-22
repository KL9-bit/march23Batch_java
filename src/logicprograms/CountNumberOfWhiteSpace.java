package logicprograms;

public class CountNumberOfWhiteSpace {
	public static void main(String[] args) {
		
		String s= "V el o     c i ty";
		int count =0;
		for(int i=0; i<=s.length()-1;i++) 
		   {
			char temp= s.charAt(i);
			if(temp==' ')
			{
				count++;
			}
			
		}
		System.out.println("Number of white space are = "+count);
	}

}
