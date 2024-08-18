package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C_Arraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);		
		al.add(10);
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(50);
		al.add(60);
		System.out.println(al);
		al.add(2, 100);
		System.out.println(al);
		al.addFirst(0);
		System.out.println(al);
		al.addLast(90);
		System.out.println(al);
		
		
		ArrayList<String>als= new ArrayList<String>();
		als.add("komal");
		als.add("kw");
		als.add(null);
		als.add("ketuu");
		als.add("vedika");
		als.add("komal");
		System.out.println(als);
		
	System.out.println("====================for loop=======================");
	
	for(int r=0; r<=al.size()-1;r++)
	{
		
		
		System.out.println(al.get(r));
	}
		
	System.out.println("====================for each loop=======================");
	for(Object b:al)
	{
		System.out.println(b);
	}
	

	System.out.println("==============iterator================");
	
	
	Iterator<String> r= als.iterator();
	while(r.hasNext())
	{
		System.out.println(r.next());
		
	}
	
	System.out.println("==============list iterator================");
	ListIterator<Integer> a=al.listIterator();
	while(a.hasNext())
	{
		
		System.out.println(a.next());
	}
		}

}
