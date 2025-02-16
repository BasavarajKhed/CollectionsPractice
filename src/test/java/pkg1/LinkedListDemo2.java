package pkg1;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
//		System.out.println(l);
		
		/*
		 * LinkedList dup=new LinkedList(); dup.addAll(l); System.out.println(dup);
		 * dup.removeAll(dup); System.out.println(dup);
		 */
		
		
		Collections.sort(l);
		System.out.println(l);
		
		
		Collections.shuffle(l);
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		
		
		
		
		
	}

}
