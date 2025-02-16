package demo.collections;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(100);
		hs1.add(200);
		hs1.add(300);
		hs1.add(400);
		
		System.out.println("Hashset1 "+hs1);
		
		HashSet hs2=new HashSet();
		hs2.add(200);
		hs2.add(300);
		hs2.add(400);
		
		System.out.println("Hashset2 "+hs2);
		
		/*hs1.addAll(hs2);
		System.out.println("Union "+hs1);
		*/
		
//		Intersection
//		hs1.retainAll(hs2);
//		System.out.println();
//		System.out.println("Intersections "+hs1);
		
//		hs1.removeAll(hs2);
//		System.out.println("Difference "+hs1);
		
		
		System.out.println(hs1.containsAll(hs2));
		System.out.println("subset "+hs1);
		
	}

}
