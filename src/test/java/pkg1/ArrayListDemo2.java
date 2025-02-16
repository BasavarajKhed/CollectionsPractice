package pkg1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

//		System.out.println(al);

		/*
		 * ArrayList dup = new ArrayList(); dup.addAll(al); System.out.println(dup);
		 * 
		 * dup.removeAll(al);
		 * 
		 * System.out.println(dup); System.out.println(dup.isEmpty());
		 */
		
		/*
		 * Collections.sort(al); System.out.println(al);
		 */
		
//		Collections.shuffle(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		
		
		
		
	}

}
