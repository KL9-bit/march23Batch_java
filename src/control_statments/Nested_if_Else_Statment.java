package control_statments;

public class Nested_if_Else_Statment {

	public static void main(String[] args)
	{
		//enter you mailid and password
		//outer if email id is correct, than enter the password
		//inside if password is correct than login successful
	    //inside else password is incorrect
		//outer else mailid is incorrect
		String mailid="komalclagade@gmail.com";
		String password="lagadeveda123";
		if(mailid =="komalclagade@gmail.com") 
		{
		
			System.out.println("mail-id is correct enter password");
			
			if(password == "lagadeveda123") 
			{
				
				System.out.println("correct password you have login successfully");
			}
			else 
			{
			
				System.out.println("password is incorrect");	
			}
		}
		else 
		{
			
			System.out.println("email id is incorrect");
		}
		System.out.println("=================assignment 2===================");
		//if you have mango tree--->collect mangoes
		    //if mangoes are yellow
		    //else wait for few days
		//else purchase mangoes

	String tree="mango";
		String colour="yellow";
		
		if(tree=="mango")
		{
			
			System.out.println("collect mangoes");
			if(colour=="yellow")
			{
				System.out.println("eat mangoes");
				
			}else {
				
				System.out.println("wait for few days");
			}
		}
		else 
		{
			System.out.println("purchase mangoes");
			
		}
		
	}

}
