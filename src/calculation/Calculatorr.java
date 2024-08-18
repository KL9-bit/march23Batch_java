package calculation;

public class Calculatorr {
	
	static int c = 1990;
	static int d = 199;

	public static void main(String[] args) {
		
	
		Calculatorr calculatorr= new Calculatorr();
		calculatorr.subtraction();
		calculatorr.division();
		Calculatorr.addition();
		Calculatorr.multiplication();
	}
	
	public void subtraction()
	{
		int sub = c-d;
		System.out.println("subtraction is  "+ sub);
	}
public static void addition()
{
int add= c+d;
System.out.println("addition of c + d ="+add);
}
public static void multiplication()
{
	int mul=c*d;
System.out.println("Multiplication of c*d = "+ mul);	
}
public void division()
{
int div =c/d;
System.out.println("division of c/d = " +div);
}
}

