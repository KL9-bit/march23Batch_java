package object;

public class Objectstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// this is main method
		System.out.println("main method runnig");
		//i want to call static regular method
		//methodName();
m1();
//i want call non static regular method
//we need object from same class
//ClassName objectName= new ClassName();
Objectstudy objectstudy= new Objectstudy();
objectstudy.m2();
		
	}
//static regular method,non-static regular methods
	public static void m1()//regular method
	
	{
		System.out.println("this is static regular m1 methods");
		
	}
	public void m2()//this is non static regular method
	{
		
		System.out.println("this is non-static regular m2 methods");
	}
	
}
