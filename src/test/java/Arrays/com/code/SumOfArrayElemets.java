package Arrays.com.code;

import java.util.Arrays;

public class SumOfArrayElemets {

	public static void main(String[] args) {
		int a[] = { 1, 7, 3 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		System.out.println("Sum Of Elements " + sum);
	}

}
