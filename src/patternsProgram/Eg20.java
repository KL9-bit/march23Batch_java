package patternsProgram;

public class Eg20 {

	public static void main(String[] args) {
		
		//**  **  **
		//**  **  **
		//**********
		//**********
		//**  **  **
		//**  **  **
		
		int row=6;
		int coloum=10;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=coloum;j++)
			{
				if(i==3||i==4||j==1||j==2||j==5||j==6||j==9||j==10) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
		

	}

}
