package Arrays.com.code;

public class SwapTwoStrings {

	public static void main(String[] args) {
	
		
		String s1="Java";
		String s2="Selenium";
		System.out.println("Before Swapping....");
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s1.concat(s2); //Java Selenium
		s2=s1.substring(0,s1.length()-s2.length());
		System.out.println(s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping....");
		System.out.println(s1);
		System.out.println(s2);
		
		
		int x=5;
		int y=10;
		
		/*
		 * x=x+y; //15 y=x-y; //15-10 x=x-y;
		 *///15-5
		 int temp=x;
		 x=y;
		 y=temp;
		 
		System.out.println(x);
		System.out.println(y);

	}

}
