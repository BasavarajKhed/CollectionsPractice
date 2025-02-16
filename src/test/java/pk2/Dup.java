package pk2;

public class Dup {

	public static void main(String[] args) {
		String s = "Selenium";
		char a[] = s.toCharArray();

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Dublicate Element found : " +a[j]);
					count++;
				}
			}
		}

		System.out.println("Dublicate element found " + count);

	}

}
