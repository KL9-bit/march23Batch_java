package all_practice;

public class ALL_P {
	
	static int a=284632;
	 String city="Pune";
	 String city2="Mumbai";
	
	public static void main(String[] args)
	{
			char c='A';
			ALL_P ap=new ALL_P();
			method1(0);
	System.out.println("The first string name = "+ ap.city);
	System.out.println("The second string name = "+ ap.city2);
		System.out.println("The Character variable is = "+c);
		System.out.println("Calling static variable int = "+a);
		
	
		System.out.println("==============================If else=========================================");
		
		if(ap.city=="Pune")
		{
			System.out.println("This is Pune");
			
			}
			else
			{
				System.out.println("This is not Pune");
			}		
		
		System.out.println("=============================For-Loop Statment==========================================");

	for(int i=1;i<=150;i=i+15)
	{
		System.out.println(i);
		System.out.println(ap.city+" to "+ap.city2+" road distance is in kilometer "+i);
		
	}
		
	}
	
	public static void method1(int b)
	{
 b=16550;
 int sum=a+b;
 System.out.println("Addition of a+b = "+sum);

System.out.println("===================================================================================");
}
	/* void method2() 
	{
		
		System.out.println("city name is = "+city);
		System.out.println("city2 name is = "+city2);
		System.out.println("===================================================================================");
	}
	
	/*public void method3()
	{
		String city="Pune";
		if(city=="Pune")
		{
			System.out.println("This is Pune");
			
		}
		else
		{
			System.out.println("This is not Pune");
		}
		System.out.println("===================================================================================");	
	}

		 public void method4() {
			 
			
			    for (int i = 15; i <= 150; i += 15) {
			        System.out.println(i);
			    }
			    System.out.println("===================================================================================");
			
	 }*/
//======================loop statement====================================
	

}
/*
create a package name all practice,
then create 2 classes in that named (All_P) & (All_P2) then create a 4 global variables of them 2 String and 1 char and 1 static variable int.
[FOR 1ST CLASS]
 String city="pune";
 String city2="mumbai";
 char c='A';
 static int a=284632;
 

create 4 methods,assign value of static variable int to any method with parameter. and other 2 methods with String global variable in main method(invoke all methods in main method with parameter),
 try 2 String values invoke in main method using if else statement for o/p.
measure incremental distance of 2 cities with Loop statement.

//call MAIN method of 2nd class in 1st class where we all doing these operations.


[FOR 2ND CLASS]

assign global variables using object.
change value of  any 1 global variable in 2nd class and call in main method of 1st class.
create object to call class variable in main method.*/