package pk2;

public class TestS {

	public static void main(String[] args) {
		String s = "TATA";
		int count = 0;

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Dublicate Element found "+ch[j]);
					count++;
				}
			}
		}

	}

}
