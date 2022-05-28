package A1Q1;

import java.util.Scanner;

public class A3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int ln = sc.nextInt();
        try{
            if(ln<0){
                sc.close();
                throw new NumberFormatException("Entered number is negative");
            }
        } catch(NumberFormatException e){
            System.err.println(e);
            System.exit(1);
        } 
        System.out.println("Your lucky number is: "+ln);
        
        sc.close();
    }
}
