package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer <String> print = System.out::print;
		Consumer <String> println = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW ", "Honda ", "Audi ");
		
		// .stream() => operação de build = a stream foi construida a partir da list
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		// o melhor caso é criar as lambdas expression e ***armazena-las em variaveis*** para assim usá-las nos **maps**
		
		/*
		 * 					FOI CRIADA CLASSE ***UTILITARIOS*** PARA ARMAZENAS AS INTERFACES FUNCIONAIS ABAIXO
		 */
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		// UnaryOperator<String> grito = n -> n + "!!! ";
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // concatenado com uma String vazia para o char ser "convertido" em String
		
		
		// com o .map() é possível usar composição em um conjunto de dados ao invés de usar em um único dado
		System.out.println("\n\nUsando composição num conjunto de dados...");
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
		marcas.forEach(println);
		
	}

}
