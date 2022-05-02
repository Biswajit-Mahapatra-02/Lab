public class StudentDetailsQ9{
 public static void main(String args[]){
   StudentQ9 A = new StudentQ9();
   StudentQ9 B = new StudentQ9();
   StudentQ9 C = new StudentQ9();
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
