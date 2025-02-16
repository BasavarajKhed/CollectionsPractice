package Arrays.com.code;

public class t {
	
	public static void main(String[] args) {
		String s="madam";
		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}

		if(rev.equals(s))
		{
		System.out.println("Given String is Palindrome");
		}
		else{
		System.out.println("Given String is not Palindrome");
		}
	}

}
