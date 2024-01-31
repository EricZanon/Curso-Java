package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		// um predicate recebe um objeto e retorna ***true or false***
		Predicate<Integer> isPar = num -> num %2 == 0;
		Predicate<Integer> isTresDigitos = num -> (num >= 100 && num <= 999);
		
		System.out.println(isPar.test(4));
		
		// "and" faz a associação logica && entre 2 ou mais predicados 
		System.out.println(isPar.and(isTresDigitos).test(199));
		
	}

}
