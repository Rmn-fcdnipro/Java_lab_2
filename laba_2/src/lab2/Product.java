package lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Product implements IMathOperations {
	
	ArrayList<IMathOperations> f;

	@Override
	public double calculate(double x) {
		
		double res = 1;
		
		for(IMathOperations o : f)
		{
			res *= o.calculate(x);
		}
		
		return res;
	}
	
	@Override
	public double calculate_derivative(double x) {
		
		double res = 0;
			
		for(int i = 0; i < f.size(); i++)
		{
			double res_1 = 1;
			
			for(int j = 0; j < f.size(); j++)
			{
				if (f.get(i) != f.get(j))
				{
					res_1 *= f.get(j).calculate(x);
				}
				else
				{
					res_1 *= f.get(i).calculate_derivative(x);
				}
			}
				
			res += res_1;
		}
		
		return res;
	}
		

	
	public Product(IMathOperations ...x) {
		
		this.f = new ArrayList<>(Arrays.asList(x));
	}

}
