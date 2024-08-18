package logicprograms;

public class OccuranceOfCharInString {
    public static void main(String[] args) {
     String k="nitin";
     int count =0;
     
     for(int i=0;i<=k.length()-1;i++)
     {
      char temp = k.charAt(i);
      if(temp=='n'){
        count++;
      }
     }
      System.out.println("Occurance Of Char In String of n = "+count);
	}

}
