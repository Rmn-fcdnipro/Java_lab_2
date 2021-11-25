package lab2;

import java.lang.Math;

public class Log implements IMathOperations {
	
	private double a;
	
	private IMathOperations f;

	@Override
	public double calculate(double x) {
		
		double result = 0;
		
		if (f != null)
		{
			result = this.f.calculate(x);
			
			result = Math.log(a*result);
		}
		else
		{
			result = Math.log(a*x);
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
	double result = 1;
		
		if (f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= 1.0/this.f.calculate(x);
		}
		else
		{
			result = 1.0/x;
		}
		
		return result;
		
	}
	
	public Log(double a) {
		
		this.a = a;
		
		this.f = null;
		
	}
	
	public Log(double a, IMathOperations f) {
		
		this.a = a;
		
		this.f = f;
		
	}

}
