package demo.collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		System.out.println("Numbers in the array " + hs);

		HashSet hs_dup = new HashSet();
		hs_dup.addAll(hs);
		hs_dup.add(500);
		System.out.println(hs_dup);
		hs_dup.removeAll(hs);
		
		System.out.println(hs_dup);

	}

}
