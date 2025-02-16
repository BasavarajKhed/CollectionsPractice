package pk2;

public class Search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int num=7;
		boolean status=false;
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==num) {
				System.out.println("Element found");
				status=true;
				break;
				
			}
			
		}
		
		if(status==false) {
			System.out.println("Element Not found ");
		}
	}

}
