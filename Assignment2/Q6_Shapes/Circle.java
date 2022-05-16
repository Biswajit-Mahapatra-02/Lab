package Q6_Shapes;

public class Circle extends Shape{
	private double r;
	double area() {
		return Math.PI*r*r;
	}
	void setR(double r) {
		this.r = r;
	}
}
