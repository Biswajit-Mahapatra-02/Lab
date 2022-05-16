package Q6_Shapes;

public class Main {
	public static void main(String args[]) {
		Square S = new Square ();
		S.setA(5);
		System.out.println("Square area: " + S.area());
		Triangle T = new Triangle();
		T.setB(3);
		T.setH(5);
		System.out.println("Triangle area: "+T.area());
		Circle C = new Circle();
		C.setR(5);
		System.out.println("Circle area: "+C.area());
	}
}
