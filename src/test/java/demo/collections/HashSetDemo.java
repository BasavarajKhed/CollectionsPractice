package demo.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); // default capacity 16 load factor 0.75
//		HashSet hs=new HashSet(100,(float)0.90);

//		HashSet<String> hs=new HashSet<String>();
		hs.add(100);
		hs.add(189.9);
		hs.add("Test");
		hs.add(null);
		hs.add(true);
		hs.add('A');
		System.out.println(hs);

		hs.remove(100);
		System.out.println("After Removing element");
		System.out.println(hs);

		/*
		 * for(Object he:hs) { System.out.println(he); }
		 */

		System.out.println(hs.contains("Test"));

		System.out.println(hs.isEmpty());

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
