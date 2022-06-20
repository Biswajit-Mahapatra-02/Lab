package S_LinkedList;

import java.util.Scanner;
public class LinkedList{
  Node start; 
  void create(){
    node A=new node();
    do{
      Node P = new Node();
      Scanner sc = new Scanner(System.in);
      System.out.print("Input node value: ");
      P.info = sc.nextInt();
      P.link = null;
      if(start==null){
        start = P;
        A = P;
      } else {
        A.next = P;
        A = P;
      }
      System.out.println("Do you want to add more nodes?(y/N)");
      char c = sc.next().charAt(0);
    }while(c=='Y');
  }
  void display(){
    Node P = start;
    while(P.link!=null){
       System.out.println("Node information: "+P.info);
       P=P.link;
    }
  }
}
