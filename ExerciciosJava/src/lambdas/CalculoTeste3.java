package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		// com o BinaryOperator não é necessário criar uma nova interface funcional
		// é possível usar essa interface funcional já criada pelo java
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2., 3.));
		
		
		BinaryOperator<Integer> calc2 = (x, y) -> { Integer a = x * y; return a; };
		System.out.println(calc2.apply(5, 2));
		
		calc = (x, y) -> x / y;
		System.out.println(calc.apply(6., 2.));
	
	}

}
 