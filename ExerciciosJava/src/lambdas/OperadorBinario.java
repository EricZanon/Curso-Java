package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		// recebe 2 valores e retorna um outro valor do mesmo tipo
		
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(6.5, 8.7));

		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		// usando a composição das funções média e conceito:
		
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
		
		
		
		/*
		 *  uma BiFunction recebe dois valores de tipos diferentes e retorna uma terceiro
		 *  valor, que também pode ser de tipo diferente
		 */ 
		
		BiFunction<Double, Double, String> isAprovado = (n1, n2) -> {
			double notaFinal = ((n1 + n2) / 2);
			return notaFinal >= 7.0 ? "O aluno foi aprovado com a nota: " + notaFinal : 
				"O aluno foi Reprovado com a nota: " + notaFinal;
		};
		
		System.out.println(isAprovado.apply(8.0, 6.8));
		
		
	}

}
