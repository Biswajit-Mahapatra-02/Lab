package Q5_College;

public class Student extends Person{
	private String course;
	private long rollNo;
	private double marks;
	public Student(String name, int age, String course, long rollNo, double marks) {
		super(name, age);
		this.course = course;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public long getRollNo() {
		return rollNo;
	}
	public double getMarks() {
		return marks;
	}
	
}
