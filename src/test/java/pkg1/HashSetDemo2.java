package pkg1;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> EvenNumber = new HashSet<Integer>();
		EvenNumber.add(2);
		EvenNumber.add(4);
		EvenNumber.add(6);

		System.out.println("HashSet " + EvenNumber);

		HashSet<Integer> numbers = new HashSet<Integer>();

		numbers.addAll(EvenNumber);

		numbers.add(8);

		System.out.println(numbers);
		
		
		//removeAll
		numbers.removeAll(EvenNumber);
		
		System.out.println(numbers);
		

	}

}
