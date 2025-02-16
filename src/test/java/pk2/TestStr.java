package pk2;

public class TestStr {

	public String display(String value ) {
		return value;
//		return "value";
	}

	public int cal(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {

		TestStr ts = new TestStr();
		System.out.println(ts.display("test"));
		
		int res=ts.cal(10, 20);
		
		System.out.println(res);
	}

}
