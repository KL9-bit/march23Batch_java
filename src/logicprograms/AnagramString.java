package logicprograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

//java, avaj
		 String s1="java";
		 String s2="avaj";
		 
		 char[] ar1= s1.toCharArray();//{'j','a','v','a'}
         char[] ar2=s2.toCharArray();//{'a','v','a','j'}
         
         Arrays.sort(ar1);//{'a','a','j','v'}
         Arrays.sort(ar2);//{'a','a','j','v'}
         
         boolean result=Arrays.equals(ar1,ar2);
         if(result)
         {
        	 System.out.println("this is Anagram String");
        	 
         }else
         {
        	 System.out.println("this is not Anagram String");
        	 
         }
         
         String s3="lokam";
         String s4="komal";
         char[] ar3=s3.toCharArray();
         char[] ar4=s4.toCharArray();
         
         Arrays.sort(ar3);
         Arrays.sort(ar4);
         
         boolean result1= Arrays.equals(ar3, ar4);
         if(result1)
         {
        	 System.out.println("this is anagram String");
         }
         else
         {
        	 System.out.println("this is not anagram String");
         }
         }
         

}
