import java.util.Scanner;
public class StudentQ10{
  private String name;
  private int roll;
  private double mark;
  void setData(String name, int roll, double mark ){
    Scanner sc = new Scanner (System.in);
    this.name = name;
    this.roll = roll;
    this.mark = mark;
    sc.close();
  }
  void display(){
      System.out.println("Name: "+name);
      System.out.println("Roll number: "+roll);
      System.out.println("Mark: "+mark);
  }
}
