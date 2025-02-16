package Arrays.com.code;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int a[] = { 1, 7, 3, 9, 5, 6 };
		System.out.println("Before Sort " + Arrays.toString(a));
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

		System.out.println("After Sort " + Arrays.toString(a));
	}

}
