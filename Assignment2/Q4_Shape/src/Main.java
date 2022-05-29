package Q4_Shape.src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter center for circle: ");
        CircleType C = new CircleType();
        System.out.print("Enter X coordinate: " );
        double x = sc.nextDouble();
        System.out.print("Enter Y coordinate: ");
        double y = sc.nextDouble();
        C.setCenter(x,y);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        C.setRadius(radius);
        System.out.print("Radius of the circle is set to: "+ C.getRadius());
        C.showRadius();
        System.out.print("\nPosition of the circle's center is: ("+C.circlePosition().getX()+
                ", "+C.circlePosition().getY()+")");
        System.out.print("\nArea of the given circle: "+C.circleArea());
        sc.close();
    }
}
