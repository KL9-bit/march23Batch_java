package logicprograms;

public class Factoriallll {
public static void main(String[] args) {
	
	int num=5;
	int factorial=1;
	for(int i=num;i>=1;i--)
	{
		factorial=i*factorial;
		
	}
	System.out.println("factorial of "+num+ " is = "+factorial);
}
}
