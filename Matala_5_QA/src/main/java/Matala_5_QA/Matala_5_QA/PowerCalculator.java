package Matala_5_QA.Matala_5_QA;

public class PowerCalculator {
	
	private Multiplier multiplier;
	
	public PowerCalculator(Multiplier multiplier) {
		this.multiplier = multiplier;
	}
	
	public double power(double a, double b) {
		double result = 1;
		for(int i = 0; i < b; i++) {
			result = multiplier.multiply(result, a);
		}
		return result;
	}

}
