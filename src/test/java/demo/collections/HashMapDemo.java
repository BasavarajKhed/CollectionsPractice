package demo.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//		HashMap hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "A");
		hm.put(102, "B");
		hm.put(103, "C");
		hm.put(104, "D");
		hm.put(102, "G");
		hm.put(105, "A");
		System.out.println(hm);

		System.out.println(hm.get(104));

		hm.remove(105);
		System.out.println(hm);

		System.out.println(hm.containsKey(101)); // true
		System.out.println(hm.containsKey(105)); // false
		System.out.println(hm.containsValue("A")); // true
		System.out.println(hm.containsValue("Z")); // false

		System.out.println(hm.isEmpty()); // false

		System.out.println(hm.size());
		System.out.println(hm.keySet());

		for (Object i : hm.keySet()) {
			System.out.println(i);
		}

		for (Object i : hm.values()) {
			System.out.println(i);
		}
//		System.out.println(hm.values());
//		
//		System.out.println(hm.entrySet());

		/*
		 * for (Object i : hm.keySet()) { System.out.println(i + " " + hm.get(i));
		 * 
		 * }
		 */

		/*
		 * for (Map.Entry entry : hm.entrySet()) { System.out.println(entry.getKey() +
		 * "   " + entry.getValue());
		 * 
		 * }
		 */

		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();

			System.out.println(entry.getKey() + "  " + entry.getValue());
			
		}

	}

}
