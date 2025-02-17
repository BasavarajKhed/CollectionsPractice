package demo.collections;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		System.out.println(l); // [dog, dog, cat, horse]

		l.addFirst("Tiger");
		l.addLast("Lion");
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l);
		
		

	}

}
