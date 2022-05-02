import java.util.Scanner;
public class StudentDetailsQ10 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		   StudentQ10 A = new StudentQ10();
		   StudentQ10 B = new StudentQ10();
		   StudentQ10 C = new StudentQ10();
		   System.out.println("Enter details student 1: ");
		   System.out.print("Enter name: ");
		   String name = sc.nextLine();
		   System.out.print("Enter roll: ");
		   int roll = sc.nextInt();
		   System.out.print("Enter mark: ");
		   double mark = sc.nextDouble();
		   A.setData(name, roll, mark);
		   sc.nextLine();
		   System.out.println("Enter details student 2: ");
		   System.out.print("Enter name: ");
		   name = sc.nextLine();
		   System.out.print("Enter roll: ");
		   roll = sc.nextInt();
		   System.out.print("Enter mark: ");
		   mark = sc.nextDouble();
		   B.setData(name, roll, mark);
		   sc.nextLine();
		   System.out.println("Enter details student 3: ");
		   System.out.print("Enter name: ");
		   name = sc.nextLine();
		   System.out.print("Enter roll: ");
		   roll = sc.nextInt();
		   System.out.print("Enter mark: ");
		   mark = sc.nextDouble();
		   C.setData(name, roll, mark);
		   System.out.println("Student 1 details: ");
		   A.display();
		   System.out.println("Student 2 details: ");
		   B.display();
		   System.out.println("Student 3 details: ");
		   C.display();
		   
		 }
}
