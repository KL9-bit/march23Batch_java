package access_Specifier;

public class Class2 {

	public static void main(String[] args) {
		
		Class1 C1=new Class1();
		//C1.M1();becouse private method does not run out of its class. 
		//System.out.println(C1.a);
		C1.M2();
		System.out.println(C1.b);
		C1.M3();
		System.out.println(C1.c);
		C1.M4();
		System.out.println(C1.d);
		
		
	}
}
