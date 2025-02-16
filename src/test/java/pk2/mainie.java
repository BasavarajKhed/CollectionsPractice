package pk2;

public class mainie {

	public static void main(String[] args) {
		String s = "Java";

		char d[] = s.toCharArray();
		int count = 1;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] == d[j]) {
					System.out.println("Dublicate Found " + d[j]);
					count++;
				}

			}

			
		}
		System.out.println(count);
	}

}
