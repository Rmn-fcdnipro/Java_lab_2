package lab2;

import java.lang.Math;

public class Sh implements IMathOperations {
	
	double a;
	
	IMathOperations f;

	@Override
	public double calculate(double x) {
		
		double result = 0;
		
		if(f != null)
		{
			result = this.f.calculate(x);
			
			result = Math.sinh(a*result);
		}
		else
		{
			result = Math.sinh(a*x);
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
	double result = 1;
		
		if(f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= a*Math.cosh(a*this.f.calculate(x));
		}
		else
		{
			result = a*Math.cosh(a*x);
		}
		
		return result;
	}
	
	
	public Sh(double a)
	{
		this.a = a;
		
		this.f = null;
	}
	
	public Sh(double a, IMathOperations f)
	{
		this.a = a;
		
		this.f = f;
	}


}
