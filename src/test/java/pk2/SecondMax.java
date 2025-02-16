package pk2;

import java.util.Arrays;

public class SecondMax {
	public static void main(String[] args) {
		int a[] = { 1, 7, 5, 3, 4, 5, 8 };

		System.out.println("Before Sort.....");
		System.out.println(Arrays.toString(a));

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println("After Sort.....");
		System.out.println(Arrays.toString(a));
		System.out.println(a[5]);
	}

}
