package Q6_Shapes;

public class Triangle extends Shape{
	private double b, h;
	double area() {
		return 0.5*b*h;
	}
	void setB(double b) {
		this.b = b;
	}
	void setH(double h) {
		this.h = h;
	}
}
