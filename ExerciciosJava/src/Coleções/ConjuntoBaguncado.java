package Coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {

		
		HashSet conjunto = new HashSet();

		// collectiona não suportam primitivos, então esses dados serão convertidos para
		// wrappers

		conjunto.add(1.2); // double --> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // já é objeto
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character

		// .size() tamanho do conjunto
		System.out.println("O tamanho do conjuto é: " + conjunto.size());

		// o tamanho do conjunto continua o msm pq não aceita repetição
		conjunto.add("Teste");
		System.out.println("O tamanho do conjuto é: " + conjunto.size());

		// resultado é true (caso o obj tenha sido removido) ou false (caso não tenha
		// sido removido)
		System.out.println(conjunto.remove("Teste"));
		System.out.println("O tamanho do conjuto é: " + conjunto.size());

		// resultado é true (caso o obj seja contido no conjunto) ou false (caso não
		// seja contido no conjunto)
		System.out.println(conjunto.contains(1));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// é possível fazer a intercesão entre 2 conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		// é possível unir dois conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);

		// é possível limpar o conjunto
		conjunto.clear();
		System.out.println(conjunto);

	}

}
