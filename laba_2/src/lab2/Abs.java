package lab2;

import java.lang.Math;

public class Abs implements IMathOperations {
	
	private IMathOperations f;

	@Override
	public double calculate(double x) {
		
		double result = 0;
		
		if (f != null)
		{
			result = this.f.calculate(x);
			
			result = Math.abs(result);
		}
		else {
			result = Math.abs(x);
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
	double result = 1;
		
		if (f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= this.f.calculate(x)/Math.abs(this.f.calculate(x));
		}
		else {
			result = x/Math.abs(x);
		}
		
		return result;
	}

	public Abs() {this.f = null;}
	
	public Abs(IMathOperations f) 
	{
		
		this.f = f;
	}
	
}
