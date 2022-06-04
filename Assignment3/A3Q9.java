import java.util.Scanner;
class A3Q9{
  static void print(int n){
    if(n==0)
      return;
    else{
      int r = n%10;
      System.out.print(r);
      print(n/10);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    print(sc.nextInt());
  }
}
