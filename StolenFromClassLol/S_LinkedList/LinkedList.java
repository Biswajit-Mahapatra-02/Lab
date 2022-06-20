package S_LinkedList;

import java.util.Scanner;

public class LinkedList {
	Node start;
	void create() {
		Scanner sc=new Scanner(System.in);
		Node p=new Node();
		System.out.println(" Input node value");
		p.info=sc.nextInt();
		p.link=null;
		start=p;
		System.out.println("Do you want to add more nodes?(1/0)");
		int op =sc.nextInt();
		while(op!=0) {
			Node q=new Node();
			System.out.println(" Input node value");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			System.out.println("Do you want to add more nodes?(1/0)");
			 op =sc.nextInt();
		}
		
	}
	void display() {
		System.out.println("start="+start);
		Node p=start;
		while(p!=null) {
			
			System.out.println(p.info+" "+p.link);
			p=p.link;
		}
		
		
		
	}
	void count() {
		Node p=start;
		int count=0;
		while(p!=null) {
			count++;
			p=p.link;
		}
		
		System.out.println("no. of nodes="+count);
		
	}

}
