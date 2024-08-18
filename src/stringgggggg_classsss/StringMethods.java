package stringgggggg_classsss;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s="ThePuneCity";
		
		//1) Length()
		
		System.out.println(s.length());
		
         int lengthofstring=s.length(); // this is called reference variable
		System.out.println(lengthofstring);
		
		System.out.println("============2========================");
		
		//2) toUppercase()
		
		String S1="VelOCity";
		System.out.println(S1.toUpperCase());
		
		String a=S1.toUpperCase();
		System.out.println(a);
		
		System.out.println("=============3=======================");
		
		//3) toLowercase()
		
		System.out.println(S1.toLowerCase());	
		String b=S1.toLowerCase();
		System.out.println(b);
		
		System.out.println("==============4======================");
		
		//4) equals() --boolean output
		
		String c1="komal";
		String c2="komal";
		String c3="komal";
		String c4=new String("komal");
		String c5=new String("komal");
		String c6=new String("KOMAL");
		
		//difference between '==' to 'equals'
		      
		           //==  --boolean output
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c4);
		System.out.println(c4==c5);
		          //equals  --boolean output
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(c4.equals(c5));
		System.out.println(c5.equals(c6));
		System.out.println(c4.equalsIgnoreCase(c6));//ignore case means uppercase and lowercase
		
		System.out.println("===============5=====================");
		
		//5) contains()--boolean output
		
		String d1="Engineering";
	    System.out.println(d1.contains("ing"));
	    System.out.println(d1.contains("eng"));
	    boolean result = d1.contains("Rin");
	    System.out.println(result);
	    boolean results = d1.contains("rin");
	    System.out.println(results);
	
		System.out.println("================6====================");
		
	
		//6) isEmpty()--boolean output
		
		String e1="Testing";
		String e2="";
		//String e3=null;
		String e4="  ";
		
		System.out.println(e1.isEmpty());
		System.out.println(e2.isEmpty());
		//System.out.println(e3.isEmpty());//we need do comment to this because after execution of 'Null'string if we don't comment it then after 'NULL' printing  everything gets blank. 
		System.out.println(e4.isEmpty());
		System.out.println("=================7===================");
		
		//7) isBlank(--boolean output
		
		System.out.println(e1.isBlank());
		System.out.println(e2.isBlank());
		//System.out.println(e3.isBlank());
		System.out.println(e4.isBlank());
		
		System.out.println("==================8==================");
		
		//8) charAt()
		
		String f1="Testing";
		
		System.out.println(f1.charAt(2));
		System.out.println(s.charAt(9));
		char myvalue = f1.charAt(6);
		System.out.println(myvalue);
		//System.out.println(f1.charAt(-3));
		
		
		System.out.println("===================9=================");
		
		//9) endsWith()  --boolean output
		
		String g1="software";
		System.out.println(g1.endsWith("e"));
		System.out.println(g1.endsWith("software"));
		System.out.println(g1.endsWith("sof"));
		

		System.out.println("====================10================");
		
		
		//10) startWith() --boolean output
		
		
		System.out.println(g1.startsWith("soft"));
		System.out.println(g1.startsWith("ware"));
		System.out.println(s.startsWith("The"));
		
		
		
		System.out.println("======================11==============");
		
		//11) Substring 
		
		String h1="SoftwareTesting";
		System.out.println(h1.substring(7));
		System.out.println(h1.substring(0));
		System.out.println(h1.substring(12));
		System.out.println(h1.substring(4,9));
		System.out.println(h1.substring(0,15));
		String Substring = h1.substring(0,7);
		System.out.println(Substring);
	
	
		System.out.println("========================12============");
		
		//12) concat()
		
		String i1 = "Software";
		String i2 = "Testing";
	System.out.println(i1.concat(i2));
	System.out.println(s.concat(h1));
	
	String i3 = i1.concat(i2);
	System.out.println(i3);
	
	String s1 = s.concat(h1);
	System.out.println(s1);
	System.out.println("=========indexof()=========================");
	
	String j1="Testing";
	String j2="Engineering";
	System.out.println(j1.indexOf("e"));
	System.out.println(j1.indexOf("g"));
	System.out.println(j2.indexOf("n"));
	System.out.println(j2.lastIndexOf("n"));
	System.out.println(j2.indexOf("n", 8));
	System.out.println(j1.indexOf("ing"));
	System.out.println(j1.indexOf("ind"));
	
	
	
	System.out.println("---------------------array-----------------");
	int number[]=new int[3];
	
	number[0]=10;
	number[1]=110;
	number[2]=102;
		
	System.out.println(number[0]);
	System.out.println(number[2]);
	System.out.println(number[1]);
		
	Arrays.sort(number);
	
	System.out.println("==============Array======================");
	int rollnumber[]= {90,87,75,03,74,8734,9,6,43};
	Arrays.sort(rollnumber);
	
	
	for(int k=0; k<=rollnumber.length-1;k++)
	{
		System.out.println(rollnumber[k]);
		
	}

	System.out.println("====================================");

	
	}
	

}
