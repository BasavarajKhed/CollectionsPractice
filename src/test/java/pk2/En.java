package pk2;

public class En {

	private int empid;
	private String name;

	public En(int empid, String name) {

		this.empid = empid;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		En e = new En(12, "khed");
		System.out.println(e.getEmpid());
		
		System.out.println(e.getName());
		e.setEmpid(101);
		System.out.println(e.getEmpid());
	}

}
