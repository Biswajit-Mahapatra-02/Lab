package A3Q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        Student[] arr = new Student[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student "+(i+1)+" enter name and marks: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            int marks= sc.nextInt();
            try{
                if(marks<0||marks>100)
                    throw new MarksOutOfBoundsException("Marks cannot be greater than 100 or less than 0");

            } catch(InputMismatchException e){
                System.err.println("Not a number");
            } catch(MarksOutOfBoundsException e){
                System.err.println(e+"\nPlease try again with the correct input.");
                System.exit(1);
            }
            arr[i]=new Student(name, marks);
            sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
        sc.close();
    }
}
