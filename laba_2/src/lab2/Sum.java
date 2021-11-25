package lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum implements IMathOperations {

	ArrayList<IMathOperations> f;

	@Override
	public double calculate(double x) {
		
		double res = 0;
		
		for(IMathOperations o : f)
		{
			res += o.calculate(x);
		}
		
		return res;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
		double res = 0;
		
		for(IMathOperations o : f)
		{
			res += o.calculate_derivative(x);
		}
		
		return res;
	}
	
	public Sum(IMathOperations ...x) {
		
		this.f = new ArrayList<>(Arrays.asList(x));
	}

}
