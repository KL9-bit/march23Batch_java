package polymorphism;

public class Compile_time_Polymorphism {
	
	int a=190;
	public static void main(String[] args) {
		
		Compile_time_Polymorphism P=new Compile_time_Polymorphism();
		P.method1();
		P.method1(19,20);
	}
	
	void method1()
	{
		
		System.out.println("this is addtion =");
		
	}
	void method1(int a, int b)
	{
		
		int sum=a+b;
		System.out.println("addition is "+sum);
		
	}

}
