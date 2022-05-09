
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
	public Complex add(Complex P) {
		Complex R = new Complex();
		double real = this.real + P.real;
		double imag = this.imag + P.imag;
		R.setData(real, imag);
		return R;
	}
}
