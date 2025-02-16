package pkg1;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
//		HashSet lset=new HashSet();
		lset.add(700);
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset);
		

	}

}
