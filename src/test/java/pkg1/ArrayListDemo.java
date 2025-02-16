package pkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> al=new ArrayList<Integer>(); ArrayList<String> al1=new
		 * ArrayList<String>(); List al2=new ArrayList();
		 */
		ArrayList al = new ArrayList();

		al.add("Basavaraj");
		al.add(789);
		al.add(17.6);
		al.add('A');
		al.add(true);

		System.out.println(al);

		System.out.println("Number of elements in arraylist " + al.size());

//		al.remove(1);
		al.remove("Basavaraj");
		System.out.println(al);

		al.add(2, "Python");
		System.out.println(al);

		System.out.println(al.get(2));

		al.set(2, "Java");

		System.out.println(al);

		System.out.println(al.contains("Java"));

		System.out.println(al.isEmpty());

		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 */
		/*
		 * for (Object a : al) { System.out.println(a); }
		 */

		Iterator ic = al.iterator();
		while (ic.hasNext()) {
			System.out.println(ic.next());
		}

	}

}
