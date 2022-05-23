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
		
		try {
			if(amount<=0)
				throw new ArithmeticException("Bonus amount is less than or equal to zero");
		} catch (ArithmeticException e) {
			System.out.println("Since the bonus amount provided is less than or equal to zero"
					+ " nothing will be added ");
			amount = 0;
		}
		this.salary+=amount;
	}
}
