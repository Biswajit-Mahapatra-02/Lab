package Q8_Company.src;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many emplyees are to be taken as input? ");
		EmpInterface[] obj = new Manager[sc.nextInt()];
		System.out.println("Manager objects created");
		for(int i = 0; i < obj.length; i++) {
			System.out.println("Employee #"+(i+1));
			System.out.print("Enter ID: ");
			long id = sc.nextLong();
			System.out.print("Enter first name: ");
			String fname = sc.nextLine();
			sc.nextLine();
			System.out.print("Enter last name: ");
			String lname = sc.nextLine();
			System.out.print("Enter salary: ");
			int salary = sc.nextInt();
			obj[i] = new Manager(id, fname, lname, salary);
		}
		System.out.println("Bonus => ");
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter bonus for employee #"+(i+1));
			obj[i].giveBonus(sc.nextDouble());
		}
		System.out.println("\nAll the employees => ");
		for(int i = 0;i<obj.length;i++) {
			System.out.println("Employee #"+(i+1));
			obj[i].displayEmp();
			System.out.println();
		}
		sc.close();
	}
}
