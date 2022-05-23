package Q9.Q9_Student1;

public class Student {
	private String name;
	private long rollNo;
	public void input(String name, long rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	public void output() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollNo);
	}
}
