package Arrays.com.code;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };

		int sum1 = 0;
		int sum2 = 0;
		int MissingNumber;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}

		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}

		MissingNumber = sum2 - sum1;

		System.out.println("Missing Number In the Array is " + MissingNumber);

	}

}
