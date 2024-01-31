package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		final int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
		
		// .compose faz as operações na sequência contraria ao .andThen
		// lê-se: antes disso, faça isso
		
		final int resultado2 = maisDois
				.compose(vezesDois)
				.compose(aoQuadrado)
				.apply(2);
		
		System.out.println(resultado2);
		
	}

}
