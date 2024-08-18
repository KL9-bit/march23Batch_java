package all_practice;

public interface Interface1 {
	
	
	
	default void method() {
		System.out.println("this is default method of interface1 ");
	}
	static void method1() {
		System.out.println("this is default method2 of interface1 ");
	}
	static void method2() {
		System.out.println("this is static method of interface1 ");
	}
	static void method3() {
		System.out.println("this is static method2 of interface1 ");
	}

}
