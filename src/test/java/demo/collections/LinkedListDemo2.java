package demo.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");

		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l); // [X, Y, Z, A, B, C]

		new_l.removeAll(l);
		System.out.println(new_l);
		System.out.println(new_l.isEmpty());
		System.out.println("Before sorting: " + l);
		Collections.sort(l);
		System.out.println("After Sorting: " + l);

//		Before sorting: [X, Y, Z, A, B, C]
//				After Sorting: [A, B, C, X, Y, Z]
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse order "+l);
//		Shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling: "+l);

	}

}
