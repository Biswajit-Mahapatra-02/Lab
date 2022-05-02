import java.util.Scanner;
public class Student{
  private String name;
  private long roll;
  private double mark;
  void setData(){
    Scanner sc = new Scanner (System.in);
    this.name = sc.nextLine();
    this.roll = sc.nextLong();
    this.mark = sc.nextDouble();
  }
  void display(){
      System.out.println("Name: "+name);
      System.out.println("Roll number: "+roll);
      System.out.println("Mark: "+mark);
  }
}
