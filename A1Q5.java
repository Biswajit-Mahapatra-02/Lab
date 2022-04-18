package Assignment1;
import java.util.Scanner;
public class A1Q5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Q5 obj=new Q5();
		int temp = obj.isOdd(n);
		if(temp==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		sc.close();
	}
	public int isOdd(int n) {
		return n&1;
	}
}
