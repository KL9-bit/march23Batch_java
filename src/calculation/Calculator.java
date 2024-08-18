package calculation;

public class Calculator {
	double a = 54;
	double b = 9;

	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		calculator.addition();
        System.out.println("=======================================================================");
		
        calculator.subtraction();
		System.out.println("=======================================================================");
		
		calculator.multiplication();
		System.out.println("=======================================================================");
		
		calculator.division();
	}
	public void addition(){
	 double sum = a+b;
		System.out.println("Addition is = "+ sum);
	}
public void subtraction(){
	double sub = a-b;
	System.out.println("subtraction is = "+ sub);
}public void multiplication()
{
	double mul = a*b;
 System.out.println("Multiplication is = " + mul);
}public void division(){
double div = a/b;
System.out.println("Division is = "+ div);
}}