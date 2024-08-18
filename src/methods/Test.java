package methods;

public class Test {

	public static void main(String[] args) {
		System.out.println("Method is running");
		m1();
		Test test= new Test();
		test.m2();
		System.out.println("=====================================================================");

		Test1.m3();
		Test1 test1= new Test1();
		test1.m4();
		
		System.out.println("main Method stopped");
	}
public static void m1()
{
     System.out.println("this is static regular m1 method from test class ");	
}
public void m2()
{
     System.out.println("this is non-static regular m2 method from test class ");

}
}
