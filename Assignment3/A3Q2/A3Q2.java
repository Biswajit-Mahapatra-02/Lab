package A3Q2;

// import java.util.Scanner;

public class A3Q2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String[] colorsStrings = {"Blue", "Black", "White", "Red", "Green"};
        try{
            int i = 0;
            while(true){
                if(i == colorsStrings.length)
                    throw new IndexOutOfBoundsException();
                System.out.print(colorsStrings[i++]+" ");
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("\nAll my favorite colors have been printed.");
        }
        System.out.print("Enter a new number? ");
        try{

        } catch(Exception e){
            System.err.println(e);
        }
    }
}
