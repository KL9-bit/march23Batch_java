package this_super;

public class This1 {
	

		public static void main(String[] args) {
			
			This1 T1=new This1();
			T1.boss();
			
		}
	    public void boss() {
	    	boss(3);
	    	System.out.println("This is boss method");
	    }
	    public void boss(int a ) {
	    	boss(3,7);
	    	System.out.println(a);
	    }
	    public void boss(int b,int d) {
	    	int sum=b+d;
	    	System.out.println("Sum is "+sum);
	    }
	}


