package Hierarchical_Inheritance;

public class A_a extends A {

	
	public static void main(String[] args) {
		
		
		A_a a=new A_a();
		a.dance();
		a.money();
		a.party();
		a.singing();
	}
	
	
	   public void dance()
	   {
		   System.out.println("Dance");
	   }
	   
	   public void singing()
	   {
		   System.out.println("singing");
	   }
}
