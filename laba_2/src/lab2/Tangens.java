package lab2;

import java.lang.Math;

public class Tangens implements IMathOperations {

	private double a;
	
	private IMathOperations f;
	
	@Override
	public double calculate(double x) {
		
		double result = 0;
		
		if(f != null)
		{
			result = this.f.calculate(x);
			
			result = Math.tan(result);
		}
		else
		{
			result = Math.tan(x);
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
		double result = 0;
		
		if(f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= 1/Math.pow(Math.cos(a*this.f.calculate(x)), 2);
		}
		else
		{
			result = 1/Math.pow(Math.cos(a*x), 2);
		}
		
		return result;
	}
	
	
	public Tangens(double a) {
		
		this.a = a;
		
		this.f = null;
	}
	
	public Tangens(double a, IMathOperations f)
	{
		this.a = a;
		
		this.f = f;
	}

}
