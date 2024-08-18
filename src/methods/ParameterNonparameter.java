package methods;

public class ParameterNonparameter {

	public static void main(String[] args)
	{ 
		displayinfo();
		ParameterNonparameter studinfo = new ParameterNonparameter();
		studinfo.studentinfo("stud1",21,22.4f,'A',88.34f, true);
		studinfo.studentinfo("stud2", 22, 23, 'B', 97.12f, true);   
		System.out.println("THE END");	
	}
	public static void displayinfo()
	{ String Name ="Shankar";
	 int rollNum = 1;
	 float age =22.9f;
	 char div='A';
	 float marks = 88.07f;
	 boolean result = true;
	 
	 System.out.println("Student information is following ");
	 System.out.println("Name is = " + Name);
	 System.out.println("Rollnumber is = "+ rollNum);
	 System.out.println("Age is = "+ age);
	 System.out.println("Division is = "+ div);
	 System.out.println("Marks are = "+ marks +"%");
	 System.out.println("The Result = "+ result);
	 System.out.println("--------------------------------");
	}
	public void studentinfo(String Name, int rollNum, float age, char div, float marks, boolean result)
	{
		 System.out.println("Name is = " + Name);
		 System.out.println("Rollnumber is = "+ rollNum);
		 System.out.println("Age is = "+ age);
		 System.out.println("Division is = "+ div);
		 System.out.println("Marks are = "+ marks +"%");
		 System.out.println("The Result = "+ result);	
		 System.out.println("--------------------------------");
	}
}
