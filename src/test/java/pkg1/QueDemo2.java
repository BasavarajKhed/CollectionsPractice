package pkg1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueDemo2 {

	public static void main(String[] args) {

//		PriorityQueue q = new PriorityQueue();
		LinkedList q = new LinkedList();

		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer(100);

//		q.add(123);
		System.out.println(q);

		// get Head element
		// element() peek()

//		  System.out.println(q.element()); 
//		  System.out.println(q.peek());

//System.out.println(q.remove());
//		System.out.println(q.remove("A"));

		/*
		 * System.out.println(q.poll()); System.out.println(q);
		 */

		/*
		 * Iterator it =q.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */

		
		  for (Object e : q) { System.out.println(e); }
		 

	}

}
