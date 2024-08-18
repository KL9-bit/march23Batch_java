package control_statments;

public class Switch_statment {

	public static void main(String[] args) {
		
		char gender='T';
				switch(gender)
				{
				case 'F':
					System.out.println("i'm female");
					break;
				case 'M' :
					System.out.println("i'm male");
					break;
				case 'T':
					System.out.println("i'm transgender");
					break;
				default :
					System.out.println("enter your gender");
				
				}
				
				System.out.println("==============Assignment 2======================");
	
	String months="june";
		
		switch(months)
		{
		case "jan":System.out.println("first momth of the year");
		break;

		case "feb":System.out.println("second momth of the year");
		break;

		case "mar":System.out.println("third momth of the year");
		break;		

		case "apr":System.out.println("forth momth of the year");
		break;

		case "may":System.out.println("fifth momth of the year");
		break;
		
		case "june":System.out.println("sixth and birth momth of the year");
		break;

		case "july":System.out.println("seventh momth of the year");
		break;
		
		case "august":System.out.println("eighth momth of the year");
		break;
		
		case "sep":System.out.println("nineth momth of the year");
		break;
		
		case "oct":System.out.println("tenth momth of the year");
		break;
		
		case "nov":System.out.println("eleventh momth of the year");
		break;

		case "dec": System.out.println("last momth of the year");
		break;

		default:System.out.println("enter valid month");
		break;
		}
		System.out.println("==========Assignment 3=============");
		
		int year=4;
		switch (year) {
	case 1:
		System.out.println("Welcome to 1st year Engg");
		break;
	case 2:
		System.out.println("Welcome to 2nd year Engg");
		break;	
	case 3:
		System.out.println("Welcome to 3rd year Engg");
		break;	
	case 4:
		System.out.println("Welcome to last year Engg");
		break;
	
	default:
		System.out.println("please enter values between 1-4");
		break;
	
	}
	}

}
