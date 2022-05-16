package Q8_Company;

public class Manager extends Employee{

	public Manager(long empID, String fname, String lname, double salary) {
		super(empID, fname, lname, salary);
		
	}

	public void displayEmp() {
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
		System.out.println("Employee ID: "+empID);
		System.out.println("Salary: "+salary);
	}

	public void giveBonus(double amount) {
		
		
	}
}
