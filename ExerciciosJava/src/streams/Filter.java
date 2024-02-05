package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Consumer<String> println = System.out::println;
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("giulia", 9.8);
		Aluno a4 = new Aluno("eric", 6.8);
		Aluno a5 = new Aluno("pedro", 7.1);
		Aluno a6 = new Aluno("gui", 8.8);
				
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		// primeiro os alunos são filtrados com .filter 
		// depois é feito o mapeamento para converter o objeto aluno para um objeto String 
		alunos.stream()
		.filter(a -> a.nota >= 7.0)
		.map(a -> a.nome + " foi aprovado(a)")
		.forEach(println);
		
		Predicate <Aluno> aprovado = a -> a.nota >= 7.0;
		Function<Aluno, String> listaAprovados = 
				a -> a.nome + " foi aprovado(a)";
		
		System.out.println("\nUsando as interfaces funcionais...");
		alunos.stream()
		.filter(aprovado)
		.map(listaAprovados)
		.forEach(println);
	}
	
}
