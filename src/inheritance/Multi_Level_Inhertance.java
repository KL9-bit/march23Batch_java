package inheritance;

public class Multi_Level_Inhertance extends Child {
	public static void main(String[] args) {
		//for non static method
		Child child= new Child();
		child.nosering();
		System.out.println("========================");
		child.dance();
		System.out.println("========================");
		child.cook();
		System.out.println("========================");
		child.money();
		System.out.println("========================");
		child.principles();
		System.out.println("========================");
		child.properties();
		System.out.println("========================");
		//for static method 
		Child.house();
		System.out.println("========================");
		Child.cars();
		System.out.println("========================");
		Child.dreams();
		System.out.println("========================");
		Child.love();
	}

}
