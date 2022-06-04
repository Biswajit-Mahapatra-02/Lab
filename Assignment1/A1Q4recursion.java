import java.util.Scanner;
class A1Q4recursion{
  static void print(n){
    if(n<1)
      return;
    else{
      String S = sc.next();
      print(n-1);
      System.out.println(S);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    print(sc.nextInt());
  }
}
