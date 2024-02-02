package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer <String> println = System.out::println;
		Consumer <Integer> printInt = System.out::println;
		
		List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 ,9 );
		
		/*
		 * 		1. converter número p/ String binária
		 * 		2. inverter a String "110" ->  "011"
		 * 		3. Converter de volta pra Inteiro = "011" -> 3 
		 * 		4. Aplicar interface para as funções -> UtilitáriosMap
		 */
		
		System.out.println("Transformando em binários...");
		
		nums.stream()
		.map(UtilitariosMap.paraBinario)
		.forEach(println);
		
		System.out.println("\nInvertendo os binários...");
		
		// tbm é possível converter p binário usando ***Integer::toBinaryString***
		nums.stream()
		.map(Integer::toBinaryString)
		.map(UtilitariosMap.inverterBinario)
		.forEach(println);
		
		System.out.println("\nConvertendo de volta pra int...");
		
		nums.stream()
		.map(UtilitariosMap.paraBinario)
		.map(UtilitariosMap.inverterBinario)
		.map(UtilitariosMap::paraDecimal)
		.forEach(printInt);
		
	}

}
