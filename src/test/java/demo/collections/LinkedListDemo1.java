package demo.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
//		Declare
		/*
		 * LinkedList<Integer> l=new LinkedList<Integer>(); LinkedList<String> l1=new
		 * LinkedList<String>();
		 */
		LinkedList l = new LinkedList();
		l.add("Test");
		l.add('A');
		l.add(1234);
		l.add(35.7);
		l.add(156.7f);
		l.add(true);
		l.add(null);
		System.out.println(l); // [Test, A, 1234, 35.7, 156.7, true, null]
		System.out.println(l.size());
		l.remove(1);
		System.out.println(l); // [Test, 1234, 35.7, 156.7, true, null]
		l.add(3, "Java");
		System.out.println("After Inserting New List " + l);
//		[Test, 1234, 35.7, Java, 156.7, true, null]

//		Retriving the value
		System.out.println(l.get(3));

//		Replace value
		l.set(5, "Basavaraj");
		System.out.println("After Changing the value " + l);

		System.out.println(l.contains("Java"));
		System.out.println(l.contains("Python"));
		System.out.println(l.isEmpty());
		System.out.println(l);
//		Reading elements
		/*
		 * for(int i=0;i<l.size();i++) { System.out.println(l.get(i)); }
		 */

		/*
		 * for(Object e:l) { System.out.println(e); }
		 */
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
		
		
	}

}
