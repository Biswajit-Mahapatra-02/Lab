package R2141013021;

import java.util.Scanner;

public class Main {
    public static Node start = null;
    public static Scanner bm = new Scanner(System.in);
    public static void create(){
		if(start==null) {
			System.out.println("List created");
		}
		char ch;
		Node a = new Node();
		do {
			Node n = new Node();
			System.out.println("Enter number");
			n.info = bm.nextInt();
			n.link = null;
			if (start == null) {
				start = n;
				a = n;
			} else {
				a.link = n;
				a = n;
			}
			System.out.println("Enter Y to add next value in node.");
			ch = bm.next().charAt(0);
		} while (ch == 'Y');
    }
    public static void display() {
        Node p = start;
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
    public static int count() {
		int c = 0;
		Node p = start;
		while(p!=null) {
			c++; p = p.link;
		}
		return c;
	}
    public static int countUnique() {
        int count = 0;
        removeDuplicate();
        Node p = start;
        while(p!=null){
            count++;
            p=p.link;
        }
        return count;
	}
    public static int search(int element) {
		int count = 0;
		Node p = start;
		if(start==null) System.out.println("List empty");
		else {
			while(p != null) {
				count++;
				if(element == p.info)
					break;
				p=p.link;
			}
            if(p == null) return -1;
			else return count;
		}
        return count;
	}
    public static void delAny(int position) {
		int count = 0;
		Node p = start;
		while(count!=(position-2)) {
			count++;
			p=p.link;
		}
		Node D = p.link;
		p.link = p.link.link;
		D.link = null;
	}
    public static void removeDuplicate() {
        Node p = start;
        int count = 0;
        while(p!=null){
            Node q = start;
            int qc = 0;
            while(q!=null){
                qc++;
                if(p.info == q.info)
                    count++;
                if(count>1)
                    delAny(qc);
                q=q.link;
            }
            p=p.link;
            count = 0;
        }
	}
    public static int find2ndMax(){
        int first, second;
        int size = count();
        if(size<2){
            System.out.println("Invalid input");
            return -1;
        }
        first = second = Integer.MIN_VALUE;
        Node temp = start;
        while(temp!=null){
            if(temp.info>first){
                second = first;
                first = temp.info;
            } else if (temp.info > second && temp.info != first) {
                second = temp.info;
            }
            temp = temp.link;
        }
        if(second == Integer.MIN_VALUE)
            return -1;
        else
            return second;
    }

    public static void main(String[] args) {
        System.out.println("Singly Linked list minor project.");
        System.out.println("Done by Biswajit Mahapatra");
        System.out.println("Regd. no. 2141013021 ");
        System.out.println("Section: 2141001");
        System.out.println("Branch: CSE");
        int choice;
        do {
            System.out.println("***Menu***");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Count number of elements in the list");
            System.out.println("4:Count number of unique elements in the list");
            System.out.println("5:Search for an element");
            System.out.println("6:Find 2nd largest element");
            System.out.println("7:Remove all duplicate elements");
            System.out.println("8:Delete at any node");
            choice = bm.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println("Number of elements: " + count());
                    break;
                case 4:
                    System.out.println("The number of unique elements: " + countUnique());
                    break;
                case 5:
                    System.out.print("Enter the element: ");
                    int ele = bm.nextInt();
                    System.out.println("Element found at: "+search(ele) );
                    break;
                case 6:
                    System.out.println("The second largest element is: "+find2ndMax());
                    break;
                case 7: removeDuplicate(); break;
                case 8:
                    System.out.print("Enter node position: ");
                    int del = bm.nextInt();
                    delAny(del);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while(true);
    }
}
