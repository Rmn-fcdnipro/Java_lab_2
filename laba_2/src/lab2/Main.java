/*Варіант 6*/

package lab2;


public class Main{
	
	private static double a = 0.1;
	private static double b = -0.5;
	private static double x = 1.65;
	
	public static void main(String[] args) {
		
		System.out.println("Робота з функцією 1");
		
		IMathOperations Linear_01 = new LinearFunction(b, -a);
		
		IMathOperations Absolute_0 = new Abs(Linear_01);
		
		IMathOperations Ln = new Log(1, Absolute_0);
		
		IMathOperations Pow_0 = new Power(2, Ln);
		
		IMathOperations Neg = new Negative(Pow_0);
		
		IMathOperations Linear_02 = new LinearFunction(a, 0);
		
		IMathOperations Tg = new Tangens(1, Linear_02);
		
		IMathOperations Absolute_1 = new Abs(Tg);
		
		IMathOperations Ln_1 = new Log(1, Absolute_1);
		
		IMathOperations Cos_0 = new Cosine(1, Ln_1);
		
		IMathOperations Res = new Sum(Cos_0, Neg);
		
		System.out.print("Значення функції 1: ");
	
		System.out.println(Res.calculate(x));
		
		System.out.print("Значення похідної функції 1: ");
		
		System.out.println(Res.calculate_derivative(x));
		
		
		
		
		System.out.println("");
		
		
		
		
		
		System.out.println("Робота з функцією 2");
		
		IMathOperations Linear_1 = new LinearFunction(1, 0);
		
		IMathOperations Linear_2 = new LinearFunction(b, 0);
		
		IMathOperations Cos = new Cosine(1, Linear_2);
		
		IMathOperations Pow = new Power(1.0/3.0, Cos);
		
		IMathOperations Linear_3 = new LinearFunction(a, 0, Pow);
		
		IMathOperations Absolute = new Abs(Linear_3);
		
		IMathOperations SinHyperbolic = new Sh(1, Absolute);
		
		IMathOperations SinHyperbolic2 = new Sh(1, Absolute);
		
		IMathOperations Result = new Product(Linear_1, SinHyperbolic, SinHyperbolic2);
		
		System.out.print("Значення функції 2: ");
		
		System.out.println(Result.calculate(x));
		
		System.out.print("Значення похідної функції 2: ");
		
		System.out.println(Result.calculate_derivative(x));
		
		System.out.println("Дякуємо за роботу");

	}
	
}


