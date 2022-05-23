package Q9.Q9_Student1;
import Q9.Q9_Student2.*;

public class Test extends Student implements Sports {
	private double mark1;
	private double mark2;
	public void input(String name, long rollNo, double mark1, double mark2) {
		super.input(name, rollNo);
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	public void output() {
		super.output();
		System.out.println("Total marks: "+(mark1+mark2));
		System.out.println("Total score: "+(score1+score2));
	}
}
