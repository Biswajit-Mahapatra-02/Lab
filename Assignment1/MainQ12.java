import java.util.Scanner;

public class MainQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlowerQ12 A = new FlowerQ12();
        System.out.print("Enter name: ");
        A.setName(sc.nextLine());
        System.out.print("Enter number of petals: ");
        A.setNop(sc.nextInt());
        System.out.print("Enter price: ");
        A.setPrice(sc.nextFloat());
        System.out.println("Name: "+A.getName()+"\nNumber of petals: "+A.getNop()+"\nPrice: "+A.getPrice());
        sc.close();
    }
}
