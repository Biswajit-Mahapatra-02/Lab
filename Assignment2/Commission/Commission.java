
public class Commission {
	private double sales;
	Commission(double sales){
	 this.sales = sales;	
		
	}
	public double getCommission() {
		double commission;
		if(sales<500)
			commission=0.02*sales;
		else if(sales>=500 && sales<5000)
			commission=0.05*sales;
		else
			commission=0.08*sales;
		return commission;
	}
}
