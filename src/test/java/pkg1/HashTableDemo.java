package pkg1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {

		// Hashtable t=new Hashtable();
//		Hashtable t=new Hashtable(100,0.90f);

		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Kennedy");
//		t.put(null, "X");
//		t.put(105, null);
		System.out.println(t);
		System.out.println(t.get(101));
		System.out.println(t.remove(102));
		System.out.println(t);
		System.out.println(t.containsKey(101));
		System.out.println(t.containsKey(105));
		System.out.println(t.containsValue("John"));
		System.out.println(t.containsValue("X"));
		System.out.println(t.isEmpty());
		System.out.println(t.keySet());
		System.out.println(t.values());
//		System.out.println(t.entrySet());

		/*
		 * for(Object x:t.keySet()) { System.out.println(x+"  "+t.get(x)); }
		 */

		// Entry Specific Methods...
		/*
		 * for (Map.Entry entry : t.entrySet()) { System.out.println(entry.getKey() +
		 * " " + entry.getValue()); }
		 */
		
		
		Set s=t.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry =(Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
