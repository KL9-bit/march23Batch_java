package Hierarchical_Inheritance;

public class A_b extends A{
	public static void main(String[] args) {
		
		A_b b=new A_b();
		b.money();
		b.party();
		b.fun();
		b.dress();
	}
	
	
	public void dress() 
	{
		System.out.println("dresses");
		
	}
	
	public void fun()
	{
		System.out.println("fun day");
		
	}

}
