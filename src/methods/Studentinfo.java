package methods;

public class Studentinfo {

	public static void main(String[] args) {

Studentinfo st = new Studentinfo();
st.displayinfo();
	}
public void displayinfo()
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
 System.out.println("Marks are = "+ marks);
 System.out.println("The Result = "+ result);
 System.out.println("THE END");
}
}
