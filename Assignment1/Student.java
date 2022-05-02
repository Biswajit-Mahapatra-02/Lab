import java.util.Scanner;
public class Student{
  private String name;
  private long roll;
  private double mark;
  void setData(String name, long roll, double mark){
    this.name = name;
    this.roll = roll;
    this.mark = mark;
  }
  void display(){
      System.out.println("Name: "+name);
      System.out.println("Roll number: "+roll);
      System.out.println("Mark: "+mark);
  }
}
