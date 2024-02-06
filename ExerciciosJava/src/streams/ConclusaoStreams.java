package streams;

import java.util.Arrays;
import java.util.List;

public class ConclusaoStreams {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("luna", 6.1);
		Aluno a3 = new Aluno("giu", 8.1);
		Aluno a4 = new Aluno("gabi", 10.0);
		Aluno a5 = new Aluno("ana", 7.1);
		Aluno a6 = new Aluno("pedro", 6.1);
		Aluno a7 = new Aluno("giu", 8.1);
		Aluno a8 = new Aluno("maria", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		// para que o distinct funcione corretamente é necessário implementar equals e hashcode
		//mostrará apenas os elementos distintos da stream, sem duplicações
		System.out.println("distinct...\n");
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("\nSkip e limit..");
		alunos.stream()
			.distinct()
			// .skip recebe como parâmetro a qtd de elementos q vc quer pular
			.skip(3)
			// .limit recebe como parâmetro o nmr de elementos máximo da sua stream
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile..");
		alunos.stream()
			.distinct()
			.skip(2)
			// exibe os elementos da stream até que eles não façam parte do predicate passado como parâmetro
			// quando o método encontrar um elemento false a execussão é suspensa
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
	}

}
