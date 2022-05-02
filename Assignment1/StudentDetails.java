import java.util.Scanner;
public class StudentDetails{
 public static void main(String args[]){
   Student A = new Student();
   Student B = new Student();
   Student C = new Student();
   System.out.println("Enter details student 1: ");
   A.setData();
   System.out.println("Enter details student 2: ");
   B.setData();
   System.out.println("Enter details student 3: ");
   C.setData();
   System.out.println("Student 1 details: ");
   A.display();
   System.out.println("Student 2 details: ");
   B.display();
   System.out.println("Student 3 details: ");
   C.display();
 }
}
