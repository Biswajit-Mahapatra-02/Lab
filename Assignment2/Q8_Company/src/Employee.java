package Q8_Company.src;

public abstract class Employee implements EmpInterface {
	long empID;
	String fname;
	String lname;
	double salary;
	public Employee(long empID, String fname, String lname, double salary) {
		this.empID = empID;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	
}
