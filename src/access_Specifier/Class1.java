package access_Specifier;

public class Class1 {
private int a=10;
int b=20;
protected int c=30;
public int d=90;

	public static void main(String[] args) {
		
		Class1 C1=new Class1();
		C1.M1();
		System.out.println(C1.a);
		C1.M2();
		System.out.println(C1.b);
		C1.M3();
		System.out.println(C1.c);
		C1.M4();
		System.out.println(C1.d);
		
		
	}
	
	private void M1()
	{
		System.out.println("This is private method");
		
	}
	void M2()
	{
		System.out.println("This is default method");
		
	}
	
	protected void M3()
	{
		System.out.println("This is protected method");
		
	}
	public void M4()
	{
		System.out.println("This is public method");
		
	}
}
