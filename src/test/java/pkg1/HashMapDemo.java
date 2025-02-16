package pkg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

//		HashMap m = new HashMap();
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "X");
		m.put(106, "David");

		System.out.println(m);

		System.out.println(m.get(105));

		System.out.println(m.containsKey(101));

		System.out.println(m.containsKey(107));

		System.out.println(m.containsValue("X"));

		System.out.println(m.containsValue("Test"));

		System.out.println(m.isEmpty());

//		System.out.println(m.keySet());
//		
//		System.out.println(m.values());

		System.out.println(m.entrySet());

		/*
		 * for(Object i:m.keySet()) { System.out.println(i); }
		 */

		/*
		 * for(Object i:m.values()) { System.out.println(i); }
		 */

		/*
		 * for (Object i : m.keySet()) { System.out.println(i + " " + m.get(i)); }
		 */

		// Entry Methods
		/*
		 * for (Map.Entry entry : m.entrySet()) { System.out.println(entry.getKey() +
		 * "   " + entry.getValue()); }
		 */

		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());

			Map.Entry entry = (Entry) itr.next();

			System.out.println(entry.getKey() + "  " + entry.getValue());
			
		}

	}

}
