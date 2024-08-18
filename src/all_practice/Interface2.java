package all_practice;

public interface Interface2 {

	
	default void method() {
		System.out.println("this is default method of interface2");
	}
	default void method1() {
		System.out.println("this is static method2 of interface2");
	}
	static void method2() {
		System.out.println("this is static method of interface2");
	}
	default void method3() {
		System.out.println("this is default method2 of interface2");
	}
}
