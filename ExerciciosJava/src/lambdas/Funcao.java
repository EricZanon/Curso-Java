package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		// uma função recebe 2 parâmetros, um deles vai ser o tipo de entrada e o outro o tpo de saída
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar"; 
		
		
		// .apply aplica a função 
		System.out.println(parOuImpar.apply(3));
		
		Function<String, String> oResultadoEh = valor -> "O resultado é: " + valor;
		
		// .andThen serve para chamar uma função dentro da execução de outra função, desde que seus resultados sejam do ***MESMO TIPO***
		// é a mesma coisa que executar um .apply dentro de outro apply
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoEh)
				.apply(32);
		System.out.println(resultadoFinal+"\n");
		
		System.out.println("teste");
		System.out.println(oResultadoEh.apply(parOuImpar.apply(32)));	
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		// concatenação de 3 funções
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoEh)
				.andThen(empolgado)
				.apply(32);
		System.out.println(resultadoFinal2); 
		
	}

}
