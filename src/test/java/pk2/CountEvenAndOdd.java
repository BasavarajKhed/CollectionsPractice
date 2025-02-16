package pk2;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		int num = 123;

		int Even_count = 0;
		int Odd_count = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				Even_count++;
			}

			else {
				Odd_count++;
			}
			
			num=num/10;
			
		}
		System.out.println("Even Number " + Even_count);
		System.out.println("Odd Number " + Odd_count);
	}

}
