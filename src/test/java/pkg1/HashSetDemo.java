package pkg1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
//		HashSet hs=new HashSet(100);

//		HashSet hs=new HashSet(100,(float)0.95);
//		HashSet<String> hs=new HashSet<String>();

//		HashSet<Integer> hs=new HashSet<Integer>();
		//Add objects into HashSet
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);  //Insertion order not preserved
		
		hs.remove(16.4);
		
		System.out.println("After removing the element "+hs);
		
		System.out.println(hs.contains(100));
		
		System.out.println(hs.contains("xyz"));
		System.out.println(hs.isEmpty());
		
		
		//Reading objects from Hashset using For Each loop
		
		/*
		 * for(Object x:hs) { System.out.println(x); }
		 */
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
