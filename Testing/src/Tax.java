
public class Tax {
	
	double taxRate;
	public Tax(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getTax(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Es kann nur von positiven Zahlen die Steuer berechnet werden");
		}
		double taxFactor = 100 + this.taxRate;
		double calc = price / taxFactor;
		calc = calc * this.taxRate;
		calc = Math.round(calc * 100);
		return calc /100;
		
	}
	
	public double addTax(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Es kann nur zu positiven Zahlen eine Steuer addiert werden");
		}
		double taxFactor = 100 + this.taxRate;
		taxFactor = taxFactor / 100;
		double calc = price * taxFactor;
		calc = Math.round(calc * 100);
		return calc /100;
	}
	
	public double getWithoutTax(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Es kann nur von positiven Zahlen die Steuer berechnet werden");
		}
		double taxFactor = 100 + this.taxRate;
		taxFactor = taxFactor / 100;
		double calc = price / taxFactor;
		calc = Math.round(calc * 100);
		return calc /100;
	}
	
	
	
}
