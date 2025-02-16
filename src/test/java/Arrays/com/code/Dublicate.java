package Arrays.com.code;

public class Dublicate {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int num = 3;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				count++;
			}
		}

		/*if (count>= 2) {
			System.out.println("Dubliccate Number is  Found");
		} else {
			System.out.println("Dubmicate Number is Not found");
		}
		*/
		
		System.out.println("total Number of Elements "+count);
	}

}
