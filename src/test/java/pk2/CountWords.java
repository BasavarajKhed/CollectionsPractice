package pk2;

public class CountWords {

	public static void main(String[] args) {
		String s = "Welcome Selenim Java";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of Words in the string " +count);
	}

}
