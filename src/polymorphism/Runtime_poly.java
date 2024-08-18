package polymorphism;

public class Runtime_poly extends Runtime_polymorphism {

	
	public static void main(String[] args) {
		Runtime_polymorphism m=new Runtime_polymorphism();
		Runtime_poly p=new Runtime_poly();
		p.method();
		m.method();
		
	}
	
	public void method()
	{
		System.out.println("good evening");
		
	}
}
