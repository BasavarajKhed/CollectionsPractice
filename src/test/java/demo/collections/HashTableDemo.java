package demo.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {

//		Hashtable ht=new Hashtable(); //capacity is 11,load factor 0.75

//		Hashtable ht=new Hashtable("initial Capacity"); 
//		Hashtable t= new Hashtable(initial Capacity,fillration/loadfactor)
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "John");
		ht.put(102, "David");
		ht.put(103, "Smith");
//		ht.put(null, null);
//		ht.put(null, "Smith");
//		ht.put(104, null);
		System.out.println(ht);
		System.out.println(ht.get(103));

		ht.remove(103);
		System.out.println(ht);

		System.out.println(ht.containsKey(102));
		System.out.println(ht.containsKey(105));
		System.out.println(ht.containsValue("David"));
		System.out.println(ht.containsValue("Basavaraj"));
		System.out.println(ht.isEmpty());

		System.out.println(ht.keySet());
		System.out.println(ht.values());
		/*
		 * for (Object k : ht.keySet()) { System.out.println(k + " " + ht.get(k)); }
		 */
//Entry specific methods

		/*
		 * for(Map.Entry entry:ht.entrySet()) {
		 * System.out.println(entry.getKey()+"  "+entry.getValue()); }
		 */
		Set s = ht.entrySet();
		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
