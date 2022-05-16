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
	public void display() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Course: "+ course);
		System.out.println("RollNo: "+ rollNo);
		System.out.println("Marks: "+ marks);
		
	}
	
}
