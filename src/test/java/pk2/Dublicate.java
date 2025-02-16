package pk2;

public class Dublicate {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 3 };
		int num = 3;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				count++;
			}

		}
		/*
		 * if(count>1) { System.out.println("DUP FOUND"); } else {
		 * System.out.println("DUP not Found"); }
		 */
		System.out.println(count);
	}

}
