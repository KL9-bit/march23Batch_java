package protected_access;

import access_oprator.Access_Sp;

public class Protected_1 extends Access_Sp{
	public static void main(String[] args) {
		
		Access_Sp sp=new Access_Sp();
		sp.P4();
		System.out.println(sp.d);
		
		
		Protected_1 p=new Protected_1();
		p.P3();
   // System.out.prinln(sp.P3);
		
		
	}

	

	
	
}
