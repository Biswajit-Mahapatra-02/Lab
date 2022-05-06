import java.util.Scanner;
public class A1Q7{
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many numbers are to be taken as input?: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter "+ n + " numbers => ");
    for (int i = 0; i < arr.length; i++)
      arr[i]=sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      // int currentNumber = arr[i];
      for (int j = 0; j < arr.length; j++) {
        if(arr[i]!=arr[j])
          if((arr[i]*arr[j])%2!=0)
            System.out.println("a pair of distinct elements of the array whose product is odd: ("+arr[i]+","+arr[j]+")");
      }
    }
      sc.close();
  }
}