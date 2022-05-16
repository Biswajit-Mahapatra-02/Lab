package Q5_College;

public class Teacher extends Person{
	private String subject_assigned;
	private int contact_hour;
	public Teacher(String name, int age, String subject_assigned, int contact_hour) {
		super(name, age);
		this.subject_assigned = subject_assigned;
		this.contact_hour = contact_hour;
	}
	public String getSubject_assigned() {
		return this.subject_assigned;
	}
	public int getContact_hour() {
		return this.contact_hour;
	}
}
