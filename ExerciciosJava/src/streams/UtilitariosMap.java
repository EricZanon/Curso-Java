package streams;

import java.util.function.Consumer;
import java.util.function.Function;

public interface UtilitariosMap {
	
	Consumer <String> println = System.out::println;
	Consumer <Integer> printInt = System.out::println;
	
	// vai ser usada uma function, pois ela recebe um int e retorna uma String
	Function<Integer, String> paraBinario = n -> Integer.toBinaryString(n);
	
	Function<String, String> inverterBinario = n ->  new StringBuilder(n).reverse().toString();
	
	// Integer.parseInt(n, 2) => Convertendo uma String para um int de base 2 (n, 2) , ou seja, um nmr binário!!
	//Function<String, Integer> paraDecimal = n -> Integer.parseInt(n, 2); 
	
	
	// exemplo usando method reference
	public static int paraDecimal(String n) {
		return Integer.parseInt(n, 2); 
	}
	
}

