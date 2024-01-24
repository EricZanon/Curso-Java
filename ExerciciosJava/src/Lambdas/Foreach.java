package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	static void imprimirNome(String nome) {
		System.out.println("oi! meu nome é " + nome);
	}

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "lia", "giu");

		System.out.println("Foreach 'tradicional'...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda na versão #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));

		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda com método personalizado...");
		aprovados.forEach(nome -> imprimirNome(nome));
		
		System.out.println("\nMethod Reference com método personalizado...");
		aprovados.forEach(Foreach::imprimirNome);
	}

}
