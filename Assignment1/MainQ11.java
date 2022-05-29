import java.util.Scanner;

public class MainQ11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		PointQ11 A = new PointQ11();
		PointQ11 B = new PointQ11();
		System.out.println("Enter details for point A: ");
		A.setPoint(sc.nextDouble(), sc.nextDouble());
		System.out.println("Enter details for point B: ");
		B.setPoint(sc.nextDouble(), sc.nextDouble());
		findDistance(A,B);
		sc.close();
	}
	static void findDistance(PointQ11 A, PointQ11 B) {
		double dist = Math.sqrt(Math.pow(A.x-B.x,2) + Math.pow(A.y-B.y,2) );
		System.out.println("Distance between point A and B is  = "+ dist);
	}
}
