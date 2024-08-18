package all_practice;

public class All_Control_S {

		
		public static void main(String[] args) {
			
			int result=100;
			if(result==100)
			{
				System.out.println("you're result is ready");
				
			}
			System.out.println("=========================================================");
			
			String Name="Komal is the pretty";
			if(Name=="Komal is the pretty") {
				System.out.println(" no komal you're more than pretty than you think");
			}
			System.out.println("=========================================================");
			char m='M';
			if(m=='F')
			{
				
				System.out.println("yes, I'm a man");
				
			}else
			{
				
				System.out.println("No, i'm a Woman");
			}
			System.out.println("=========================================================");
			
			int marks=90;
			if(marks>=60)
			{
				System.out.println("first class");
							}
			else if(marks>=50)
			{
				System.out.println("second class");
							}
			else if(marks>=40)
			{
				System.out.println("third class");
							}			
			else {
				
				System.out.println("fail");
			}
			System.out.println("=========================================================");
			
		String mailid="Komalclagade@gmail.com";
		String password="1234@kl";
		
		if(mailid=="Komalclagade@gmail.com")
		{
			
		System.out.println("your mailid is valid enter password");
		
		
		if(password=="1234@kl")
		{
			System.out.println("password correct you have login");
			
		}else 
		{
			System.out.println("wrong password");}
		}
		
		else 
		{
			System.out.println("wrong emailid");
		}
		System.out.println("=========================================================");
		
		int w=66;
		switch(w)
		{
		case 33:System.out.println("hello");
		break;
		
		case 66:System.out.println("hi");
		break;
		
		case 99:System.out.println("how are you? khana khake jana h");
		break;
		
		default:System.out.println("enter valid case number");
	break;
		
		}
		System.out.println("=========================================================");
		
}
}