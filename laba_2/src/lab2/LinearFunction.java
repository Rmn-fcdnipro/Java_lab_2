package lab2;

public class LinearFunction implements IMathOperations {

	private double a;
	
	private double b;
	
	private IMathOperations f;
	
	@Override
	public double calculate(double x) {
		
		double result = 0;
		
		if (f != null)
		{
			result = this.f.calculate(x);
			
			result = a*result+b;
		}
		
		else
		{
			result = a*x + b;
		}
		
		return result;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
		double result = 1;
		
		if (f != null)
		{
			result = this.f.calculate_derivative(x);
			
			result *= a;
		}
		
		else
		{
			result = a;
		}
		
		return result;
		
	}
	

	public LinearFunction(double a, double b)
	{
		this.a = a;
		
		this.b = b;
		
		this.f = null;
	}
	
	

	public LinearFunction(double a, double b, IMathOperations f)
	{
		this.a = a;
		
		this.b = b;
		
		this.f = f;
	}
	
}
