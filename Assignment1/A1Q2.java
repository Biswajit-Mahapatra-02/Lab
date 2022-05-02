package Assignment1;
import java.util.*;
public class A1Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int temp = n;
		while(temp>0) {
			count++;
			temp/=2;
		}
		count--;
		System.out.println("The number of times one should divide "+n+" by 2 until a number less than 2 is obtained is = "+count);
		sc.close();
	}
}
