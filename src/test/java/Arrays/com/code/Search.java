package Arrays.com.code;

public class Search {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int num = 9;
		boolean status = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println("Number is Found");
				status = true;
				break;
			}
		}

		if (status == false) {
			System.out.println("Number is Not Found");
		}

	}

}
