package loop_statement;



public class For_Statement {
//multiplication using "for" loops statement
	//assingment is write a table for lees than 4 numbers and start from 2.
	//start---intialization
	//condition
	//interval---updation
	public static void main(String[] args) {
		for(int a=2; a<4; a++)
		{
			System.out.println("< " + a +" >");
			for(int b=1; b<=10; b++)
			{
				System.out.println(a +"x"+ b +"="+ a*b);
				
				
			}
			
		}System.out.println("============================================================");
		

		
	// assingment is write a table 5 assending order.
	//start---intialization  =5
		//condition= <  > >= <=  i<=50
		//interval---updation
	
		for(int i=5; i<=50;i=i+5)
		{
			
			System.out.println(i);
		}
		// assingment is write a table 5 decending order
		//start---intialization  =5
			//condition= <  > >= <=  i<=50
			//interval---updation
	
	System.out.println("============================================================");
	
		for(int i=50; i>=5;i=i-5)
		{
			
			System.out.println(i);
		}
	
		System.out.println("============================================================");
 
 for(int i=1;i<=10;i++)
 {
	 System.out.println(i);
 }
}
}
