package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {

		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("luna", 6.1);
		Aluno a3 = new Aluno("giu", 8.1);
		Aluno a4 = new Aluno("gabi", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		
		// .allMatch retorna true se ***todos*** os elementos estão de acordo com o predicado passado como parâmetro
		System.out.println(alunos.stream().allMatch(aprovados));
		
		// .anyMatch retorna true se ***algum*** os elementos estão de acordo com o predicado passado como parâmetro
		System.out.println(alunos.stream().anyMatch(aprovados));
		
		// .allMatch retorna true se ***nenhum*** os elementos estão de acordo com o predicado passado como parâmetro
		System.out.println(alunos.stream().noneMatch(aprovados.negate()));
		
	}

}
