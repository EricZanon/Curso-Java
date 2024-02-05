package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	// reduce é uma ***Final Operation***
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;	
		
		System.out.println("Sem passar valor inicial para o reduce...");
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		// ParallelStream
		System.out.println("Reduce co valor inicial 100...");
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}

}
