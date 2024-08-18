package access_oprator;

public class Access_Sp {

	private int a = 10;
	int b = 20;
	protected int c=100;
	public int d=90;
	public static void main(String[] args) {
		
		Access_Sp ap=new Access_Sp();
		ap.P1();
		System.out.println(ap.a);
		ap.P2();
		System.out.println(ap.b);
	    ap.P3();
	    System.out.println(ap.c);
	    ap.P4();
	    System.out.println(ap.d);
	}
	
	
	private void P1()
	{
		System.out.println("This is private method");
		
	}
	
	void P2()
	{
		System.out.println("This Is Default method");
		
	}
	
	protected void P3()
	{
		System.out.println("This is Protected method");
		
	}
	public void P4()
	{
		System.out.println("This is Public Method");
		
	}
}
