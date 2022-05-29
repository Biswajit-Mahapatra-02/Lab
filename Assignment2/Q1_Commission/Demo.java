package Q1_Commission;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sales: ");
		double sales = sc.nextDouble();
		if(sales>0) {
			Commission com = new Commission(sales);
			System.out.println("The commission is: "+com.getCommission());
		}
		else
			System.out.println("Invalid value");
		sc.close();
	}

}
