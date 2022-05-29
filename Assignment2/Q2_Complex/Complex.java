package Q2_Complex;


public class Complex {
	private double real;
	private double imag;
	public void setData(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	public void display() {
		if(imag>0)
		System.out.println("The complex number is: "+real+" + "+imag+"i");
		else if (imag<0)
			System.out.println("The complex number is: "+real+" - "+imag+"i");
		else 
			System.out.println("The complex number is: "+real);
	}
	public Complex add(Complex P1, Complex P2) {
		Complex R = new Complex();
		double real = P1.real + P2.real;
		double imag = P1.imag + P2.imag;
		R.setData(real, imag);
		return R;
	}
}
