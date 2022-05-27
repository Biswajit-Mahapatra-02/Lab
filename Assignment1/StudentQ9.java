import java.util.Scanner;
public class StudentQ9{
  private String name;
  private long roll;
  private double mark;
  Scanner sc = new Scanner (System.in);
  void setData(){
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
