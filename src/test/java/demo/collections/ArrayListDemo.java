package demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

//		List al = new ArrayList();
//		ArrayList<String> ts = new ArrayList<String>();
		ArrayList al = new ArrayList();

		al.add("Basavaraj");
		al.add(17.5);
		al.add(789);
		al.add(true);
		al.add(187.7f);
		al.add(189256389546l);
		al.add('A');

		System.out.println(al);
		System.out.println("Number of elements in the ArrayList "+ al.size());
		
//		al.remove(1);
		al.remove(17.5);
		System.out.println("After Removal of an element");
		System.out.println(al);
		
		al.add(2,"Python");
		System.out.println("After Insertion : "+al);
		
		
		System.out.println(al.get(2));
		
		
		al.set(2, "C#");
		System.out.println("After Replacing element:"+al);
		
		System.out.println(al.contains("C#"));
		System.out.println(al.contains("C++"));
		
		
//		isEmpty()
		System.out.println(al.isEmpty());
		System.out.println(al);
		/*for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		*/
	/*	for(Object als:al) {
			System.out.println(als);
		}
*/
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
