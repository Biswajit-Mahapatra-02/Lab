package SL;
import java.util.Scanner;
public class Test {
	public static LL start = null;
	public static Scanner sc = new Scanner(System.in);
	public static void create() {
		System.out.println("List created");
		if(start==null) {
			System.out.println("List created");
		}
		char ch;
		LL a = new LL();
		do {
			LL n = new LL();
			System.out.println("Enter number");
			n.info = sc.nextInt();
			n.link = null;
			if (start == null) {
				start = n;
				a = n;
			} else {
				a.link = n;
				a = n;
			}
			System.out.println("Enter Y to add next value in node.");
			ch = sc.next().charAt(0);
		} while (ch == 'Y');
	}
	public static void insBeg() {
		int element = sc.nextInt();
		LL p = new LL();
		p.info = element;
		p.link = null;
		p.link = start.link;
		start = p;
	}
	public static void insEnd() {
		int element = sc.nextInt();
		LL p = new LL();
		p.info = element;
		p.link = null;
		if(start==null)
			start = p;
		else {
			LL q = start;
			while(q.link!=null) {
				q=q.link;
			}
			q.link = p;
		}
	}
	public static void insAny() {
		
		int position = sc.nextInt();
		int c = count();
		if(position<1||position>c+1)
			System.out.println("Insertion not possible");
		else {
			if(position==1)
				insBeg();
			else if(position==c+1)
				insEnd();
			else {
				int element = sc.nextInt();
				LL p = new LL();
				p.info = element;
				p.link = null;
				int i = 1;
				LL q = start;
				while(i<position-1) {
					i++;
					q=q.link;
				}
				p.link = q.link;
				q.link = p;
			}
		}
	}
	public static void delBeg() {
		if(start == null) System.out.println("Underflow");
		else {
			start = start.link;
		}
	}
	public static void delEnd() {
		if(start == null) System.out.println("Underflow");
		else if(start.link == null) start = null;
		else {
			int count = 0; LL D = start;
			while(count<count()){
				count++;
				D=D.link;
			}
			LL D1 = D;
			D.link = null;
			D1 = null;
		}
	}
	public static void delAny() {
		int count = 0; 
		LL p = start;
		while(count!=count()) {
			count++;
			p=p.link;
		}
		LL D = p.link;
		p.link = p.link.link;
		D.link = null;
	}
	public static void revList() {
		if(start == null) System.out.println("Underflow");
		else if(start.link == null) System.out.println("Reverse not possible with 1 item");
		else {
			LL p = null;
			LL q = start;
			LL r = start.link;
			q.link = null;
			while(r!=null) {
				p=q;
				q=r;
				r=r.link;
				q.link = p;
			}
			start = q;
		}
	}
	public static int count() {
		int c = 0;
		LL p = start;
		while(p.link!=null) {
			c++; p = p.link;
		}
		return c;
	}
	public static void display() {
		LL p = new LL();
		p = start;
		if (start == null) {
			System.out.println("Empty list");
		} else {
			System.out.println();
			int count = 0;
			while (p != null) {
				System.out.println((++count)+" node value "+ p.info);
				p=p.link;
			}
		}
	}
	public static void search() {
		System.out.print("Enter search value: ");
		int element = sc.nextInt();
		int count = 1;
		LL p = start;
		if(count>count()) System.out.println("Overflow");
		else {
			while(p.link != null) {
				count++;
				if(element == p.info)
					break;
				p=p.link;
			}
			if(p.link == null) System.out.println("Element not found.");
			else System.out.println("Element found at: "+count);
		}
	}
	public static void main(String[] args) {
		int c;
		while (true) {
			System.out.println("****MENU*****");
			System.out.println("0:Exit");
			System.out.println("1:Creation");
			System.out.println("2:Display");
			System.out.println("3:Insert at beg");
			System.out.println("4:Insert at end");
			System.out.println("5:Insert at specific location");
			System.out.println("6:Search");
			System.out.println("7:Delete at beg");
			System.out.println("8:Delete at end");
			System.out.println("9:Delete at specific location");
			System.out.println("10:Reverse the list");
			System.out.println("11:Sorting the list");
			System.out.println("12:Number of nodes");
			System.out.println("Enter the choice");
			c = sc.nextInt();
			switch (c) {
			case 0:
				System.exit(0);
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				insBeg();
				break;
			case 4:
				insEnd();
				break;
			case 5:
				insAny();
				break;
			case 6:
				search();
				break;
			case 7:
				delBeg();
				break;
			case 8:
				delEnd();
				break;
			case 9:
				delAny();
				break;
			case 10:
				revList();
				break;
			case 11:
				
				break;
			case 12:
				System.out.println("Number of Nodes:"+ count());
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}
