package S_LinkedList;

import java.util.Scanner;
public class LinkedList {
	  Node start; 
	  void create(){
		  Scanner sc = new Scanner(System.in);
	    Node A=new Node();
	    char c ;
	    do{
	      Node P = new Node();
	      
	      System.out.print("Input node value: ");
	      P.info = sc.nextInt();
	      P.link = null;
	      if(start==null){
	        start = P;
	        A = P;
	      } else {
	        A.link = P;
	        A = P;
	      }
	      System.out.println("Do you want to add more nodes?(y/N)");
	      c = sc.next().charAt(0);
	    }while(c=='Y');
	    sc.close();
	  }
	  void display(){
	    Node P = start;
	    while(P.link!=null){
	       System.out.println("Node information: "+P.info);
	       P=P.link;
	    }
	    System.out.println("Node information: "+P.info);
	  }
	  int count() {
		  Node P = start;
		  int counter = 0;
		  while(P!=null) {
			  counter++;
			  P=P.link;
		  }
		  return counter;
	  }
}

