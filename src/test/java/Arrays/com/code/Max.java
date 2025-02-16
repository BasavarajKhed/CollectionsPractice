package Arrays.com.code;

public class Max {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6,100 };
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Maximun Element in the array " + min);
	}

}
