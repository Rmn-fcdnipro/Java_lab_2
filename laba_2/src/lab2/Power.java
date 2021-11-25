package lab2;

import java.lang.Math;

public class Power implements IMathOperations {
	
	private double a;
	
	private IMathOperations f;

	@Override
	public double calculate(double x) {
		
		double result = 0;
		
		if (f != null)
		{
			result = this.f.calculate(x);
			
			result = Math.pow(result, a);
		}
		else 
		{
			result = Math.pow(x, a);
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
		double result = 1;
		
		if (f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= a*Math.pow(this.f.calculate(x), a-1);
		}
		else 
		{
			result = a*Math.pow(x, a-1);
		}
		
		return result;
	}
	
	public Power(double a) {
		
		this.a = a;
		
		this.f = null;
	}
	
	public Power(double a, IMathOperations f)
	{
		this.a = a;
		
		this.f = f;
	}

}
