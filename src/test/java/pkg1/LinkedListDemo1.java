package pkg1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();

//		LinkedList<Integer> l=new LinkedList<Integer>();
//		LinkedList<String> l1=new LinkedList<String>();
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);

		System.out.println(l);
		System.out.println(l.size());
		l.remove(3);
		System.out.println("After removing, New list");
		System.out.println(l);

//		Adding
		l.add(3, "Java");
		System.out.println("After Insertion");
		System.out.println(l);

		System.out.println(l.get(3));
		l.set(5, "X");

		System.out.println(l);
		
		System.out.println(l.contains("Java"));
		
		
		System.out.println(l.contains("Python"));
		
		System.out.println(l.isEmpty());
		/*
		 * for(int i=0;i<l.size();i++) { System.out.println(l.get(i)); }
		 */
		
		/*
		 * for(Object x:l) { System.out.println(x); }
		 */
		/*
		 * Iterator it=l.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */

		
		
		
	}

}
