package Q9_Student2;
import Q9_Student1.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Test ob = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter roll: ");
		long rollNo = sc.nextLong();
		System.out.print("Enter mark1: ");
		double mark1 = sc.nextDouble();
		double mark2 = sc.nextDouble();
		ob.input(name, rollNo, mark1, mark2);
		ob.output();
		sc.close();
	}
}
