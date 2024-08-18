package logicprograms;

public class ReverseString1 {
	public static void main(String[] args) {


		String s1 = " i am in erolgnaB city";//  Banglore 
				//I am in Banglore city
				String s2 = "erolgnaB";
				String[] ar1 = s1.split(" ");
				for (int i = 0; i <= ar1.length - 1; i++) {
					if (ar1[i].equals(s2)) {
						String temp1 = ar1[i];
						String rev = " ";
						for (int j=temp1.length()-1;j>= 0;j--) {
							rev = rev + temp1.charAt(j);
						}
						ar1[i]=rev;
					}
					System.out.print(ar1[i] + " ");
				}
				System.out.println();
System.out.println("==========================================================");
				String s4="I am in Pune city";
				//I am in enuP city

				String s3="Pune";
				String[] ar=s4.split(" ");
				for(int i=0;i<=ar.length-1;i++)
				{
				if(ar[i].equals(s3))
				{
				String temp=ar[i];
				String revv="";
				for(int j=temp.length()-1;j>=0;j--)
				{
				revv=revv+temp.charAt(j);
				}
				ar[i]=revv;
				}
				System.out.print(ar[i]+" ");
				}
				}
				}
