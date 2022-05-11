import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, rollNo and course of 5 students => ");
        Exam[] arr = new Exam[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Student "+(i+1)+" => \n");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("RollNo: ");
            long rollNo = sc.nextLong();
            sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();
            arr[i] = new Exam();
            arr[i].input_Student(rollNo, name, course);
            System.out.println("Student "+(i+1)+" Enter marks in 3 subjects: ");
            System.out.print("Subject1: ");
            double mark1 = sc.nextDouble();
            System.out.print("Subject2: ");
            double mark2 = sc.nextDouble();
            System.out.print("Subject3: ");
            double mark3 = sc.nextDouble();
            arr[i].input_Marks(mark1, mark2, mark3);
            System.out.println("Student number "+(i+1)+" created and marks recorded. \n");
            sc.nextLine();
        }
        System.out.println("\nResult of 5 students are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student "+(i+1)+" => ");
            System.out.println("Details => ");
            arr[i].display_Student();
            System.out.println("Results => ");
            arr[i].display_Results();
            System.out.println();
        }
        sc.close();
    }
}
