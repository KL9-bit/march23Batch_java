package all_practice;

public class Class_methodoverride implements Interface1,Interface2 {
	public static void main(String[] args) {
		
		Class_methodoverride cm= new Class_methodoverride();
		cm.method();
		cm.method1();
		cm.method2();
		cm.method3();
		
		
	}

	@Override
	public void method() {
		Interface1.super.method();
		Interface2.super.method();
		System.out.println("============================================");
	}
	

	@Override
	public void method1() {
		Interface1.method1();
		Interface2.super.method1();
		System.out.println("============================================");
	}


	public void method2() {
		Interface1.method2();
		Interface2.method2();
		System.out.println("============================================");
	}

	
	public void method3() {
		Interface1.method3();
		Interface2.super.method3();
		System.out.println("============================================");
	}
	
	
	

}
