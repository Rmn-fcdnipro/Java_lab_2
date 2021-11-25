package lab2;

public class Negative implements IMathOperations {
	
	private IMathOperations f;

	@Override
	public double calculate(double x) {
		
		return -f.calculate(x);
	}

	@Override
	public double calculate_derivative(double x) {
		
		return -f.calculate_derivative(x);
	}

	public Negative(IMathOperations f)
	{
		this.f = f;
	}
}
