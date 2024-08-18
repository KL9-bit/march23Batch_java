package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorrrrrrrrr {	
	
	public static void main(String[] args) {
		Vector<Object> v= new Vector<Object>();
		v.add("velocity");
		v.add(2390);
		v.add('f');
		v.add(76.4f);
		v.add(null);
		v.add(null);
		v.add("velocity");
		v.add(11);
		System.out.println(v);		
		System.out.println("=======================vector traversing ======================");
		System.out.println("===================for loop =========================");
		
		for(int a=0; a<=v.size()-1;a++)
		{			System.out.println(v.get(a));			
		}
	
		System.out.println("===================for each loop =========================");
		for(Object b:v)
		{			System.out.println(b);
		}
		System.out.println("===================iterator =========================");
		
		Iterator<Object> s=v.iterator();
		
		while(s.hasNext())
		{			System.out.println(s.next());	
		}		
		System.out.println("===================List iterator =========================");
		ListIterator<Object> w= v.listIterator();
		while(w.hasNext())
		{
			System.out.println(w.next());
		}
		
		System.out.println("===================enumeration =========================");
		
		Enumeration<Object> ele = v.elements();
		while(ele.hasMoreElements())
		{
		System.out.println(ele.nextElement());
		}
	System.out.println("===================second example========================");

	Vector<Object> vi=new Vector<Object>();
			vi.add("velocity");
			vi.add("velocity");
			vi.add(10);
			vi.add(null);
			vi.add(true);
			System.out.println("=====");
			Enumeration<Object> en=vi.elements();
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}
}
}