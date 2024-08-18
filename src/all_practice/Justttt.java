package all_practice;

public class Justttt {
	
	 static int a=40;// static global variable

	public static void main(String[] args) {
		
		Justttt s= new Justttt();
		s.display();
		System.out.println("value of a is "+a);// calling static global variable from same class
		System.out.println("value of p is "+Justttt.a); //calling static global variable from another class
	}
	
	public void display()
	{
		int b= 30;
		
		System.out.println("value of b is "+b); //  local variable
		System.out.println("value of a is "+a); //  static global variable
		
	}
}
