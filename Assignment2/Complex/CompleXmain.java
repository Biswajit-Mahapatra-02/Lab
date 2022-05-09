import java.util.Scanner;
public class CompleXmain {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a complex number =>");
		System.out.print("Real value: ");
		double real = sc.nextDouble();
		System.out.print("Imaginary value: ");
		double imag = sc.nextDouble();
		Complex A = new Complex();
		A.setData(real, imag);
		System.out.println("\nEnter 2nd complex number =>");
		System.out.print("Real value: ");
		 real = sc.nextDouble();
		System.out.print("Imaginary value: ");
		 imag = sc.nextDouble();
		Complex B = new Complex();
		B.setData(real, imag);
		System.out.println("A + B => ");
		Complex Result = A.add(A,B);
		Result.display();
		sc.close();
	}
}
