import java.util.Scanner;

public class A1Q4 {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("how many lines do you want to enter");
    int n = s.nextInt();
    s.nextLine();
    String[] str = new String[n];
    System.out.println("Enter "+n+" lines => ");
    for (int i = 0; i < n; i++) {
        str[i] = s.nextLine();
    }
        System.out.println("Reversed output");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(str[i]);
            }
        
        s.close();
    }
}
