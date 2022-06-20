package S_LinkedList;
import java.util.*;
public class TestLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList l1=new LinkedList();
		l1.create();
		int num;
		while(true) {
			System.out.println("******Menu*****");
			System.out.println("0.Exit");
			System.out.println("1.Display");
			System.out.println("2.Count");
			System.out.println("Enter your choice");
			num=sc.nextInt();
			switch(num) {
			case 0:return;
			case 1:l1.display();
			break;
			case 2:l1.count();
			break;
			
			
			}
		}
//		l1.display();
//		l1.count();
		
		

	}

}
