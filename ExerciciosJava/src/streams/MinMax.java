package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	// é necessário implemetar um comparator parar usar max e min
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("luna", 6.1);
		Aluno a3 = new Aluno("giu", 8.1);
		Aluno a4 = new Aluno("gabi", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		// comparator retorna um int
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) {
				return 1;
			} else if(aluno2.nota > aluno1.nota) {
				return -1;
			} else {
				return 0;
			}
		};
		
		// retorna o objeto com valor máximo de acordo com o comparator passado como parâmetro
		// no caso, o melhor aluno
		System.out.println(alunos.stream().max(melhorNota));
		
		// retorna o objeto minimo de acordo com o comparator passado como parâmetro
		// no caso, o melhor aluno
		System.out.println(alunos.stream().min(melhorNota));
		
	}
}
