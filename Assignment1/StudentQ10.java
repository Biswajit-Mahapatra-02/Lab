public class StudentQ10{
  private String name;
  private int roll;
  private double mark;
  void setData(String name, int roll, double mark ){
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
