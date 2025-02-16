package pk2;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;

		/*
		 * sum=sum+a[i]; }
		 * 
		 * System.out.println(sum);
		 */

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even Num " + a[i]);

			}

			else {
				System.out.println("Odd Num " + a[i]);
			}
		}

	}
}
