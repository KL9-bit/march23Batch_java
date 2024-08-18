package methods;

public class Static_Parameter {
	public static void main(String[] args) {

		System.out.println("main method started");

		studetInfo("sanjay", 200, 'A', 65.5f);
		studetInfo("rahul", 300, 'A', 66.5f);

		System.out.println("main method ended");

	}

	public static void studetInfo(String name, int RollNo, char grade, float per) {
		System.out.println("----------student info-------------");
		System.out.println("student name: " + name);
		System.out.println("student RollNo: " + RollNo);
		System.out.println("student grade: " + grade);
		System.out.println("student per: " + per);
		
	}

}
