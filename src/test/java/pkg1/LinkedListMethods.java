package pkg1;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("cat");
		l.add("horse");
		l.add("dog");

		System.out.println(l);
		
		l.addFirst("Lion");
		l.addLast("Tiger");
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
		
		
	}

}
