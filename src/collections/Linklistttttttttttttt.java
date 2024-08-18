package collections;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linklistttttttttttttt {
	public static void main(String[] args) {
		
		LinkedList<Object> ll=new LinkedList<Object>();
	
		ll.add(13);
		ll.add("vedika");
		ll.add('M');
		ll.add(null);
		ll.add(null);
		ll.add("  ketu  ");
		ll.add(78.6d);
		ll.add("vedika");
		ll.add(23);
		
		System.out.println(ll);	
		System.out.println("=================get===================");
		System.out.println(ll.get(5));
		System.out.println(ll);
		System.out.println("================colne====================");
	    System.out.println(ll.clone());
	    System.out.println(ll);
	    System.out.println("================element====================");
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println("================contains====================");
		System.out.println(ll.contains("vedika"));
		System.out.println("================peek=================");
		System.out.println(ll.peek());
		System.out.println(ll);
	    System.out.println(ll.peekFirst());
	    System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println("================pop & poll=================");
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println("================remove====================");
		System.out.println(ll.remove(4));
		System.out.println(ll);
		System.out.println("===============Push===================");
		ll.push("komal");
		System.out.println(ll);
		ll.push("wow");
	    ll.push(77);
	    ll.push(0.0d);
	    System.out.println(ll);
	    System.out.println("======================= traversing ======================");
	    System.out.println("==============for======================");
	for(int a=0; a<=ll.size()-1; a++)
	{
		System.out.println(ll.get(a));
			
	}
	System.out.println("==============for each======================");
	for(Object f:ll)
	{
		System.out.println(f);
	}
	
	System.out.println("================Iterator====================");
	Iterator<Object> rr= ll.iterator();
	while(rr.hasNext())
	{
		System.out.println(rr.next());
	
	}
	System.out.println("================List Iterator====================");
	ListIterator<Object> tt=ll.listIterator();
	while(tt.hasNext())
	{
		System.out.println(tt.next());
	}
	
	System.out.println("==============Reverse======================");
	for(int g=ll.size()-1; g>=0;g--)
	{
		
		System.out.println(ll.get(g));	
	}
	System.out.println("==============previous======================");
	while(tt.hasPrevious())
	{
		
		System.out.println(tt.previous());
	}
	
	System.out.println("==========================Finish=================================");
	}
}
