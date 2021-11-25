package lab2;

import java.lang.Math;

public class Cosine implements IMathOperations {
	
	private double a;
	
	private IMathOperations f;

	@Override
	public double calculate(double x) {

		double result = 0;
		
		if (f != null)
		{
			result = this.f.calculate(x);
			
			result = Math.cos(a*result);
		}
		else
		{
			result = Math.cos(a*x);
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
		double result = 0;
		
		if (f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= -a*Math.sin(a*this.f.calculate(x));
		}
		else
		{
			result = -a*Math.sin(a*x);
		}
		
		return result;
	}
	
	public Cosine (double a) {
		
		this.a = a;
		
		this.f = null;
		
	}
	
	public Cosine (double a, IMathOperations f)
	{
		this.a = a;
		
		this.f = f;
	}

}
