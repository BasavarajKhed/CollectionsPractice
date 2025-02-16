package pk2;

public class Test1 {

	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;//

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (rev == num) {
			System.out.println("PN");
		} else {
			System.out.println("NPN");
		}
//		System.out.println(rev);
	}

}
