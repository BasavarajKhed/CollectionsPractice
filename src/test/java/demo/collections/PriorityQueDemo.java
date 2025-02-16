package demo.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueDemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.offer("D");
		
//		pq.offer(12);
//		System.out.println(pq); //[A, B, C, D]
//		get Head Element
//		System.out.println(pq.element());
//		System.out.println(pq.peek());

		
//		pq.remove("A");
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
		
	/*	Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		for(Object e:pq) {
			System.out.println(e);
		}
		
	}

}
