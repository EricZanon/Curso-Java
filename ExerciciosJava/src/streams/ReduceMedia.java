package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceMedia {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("luna", 6.1);
		Aluno a3 = new Aluno("giu", 8.1);
		Aluno a4 = new Aluno("gabi", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> getNota = a -> a.nota;
		
		// recebe uma média e um double e retorna outra média
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
				
		BinaryOperator<Media> combinarMedia =
				(m1, m2) -> Media.combinar(m1, m2);
		
		Media mediaTurma = 
		alunos.stream()
			.filter(aprovados)
			.map(getNota)
			// valor inicial, função acumuladra e função que vai combinar medias
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("a média dos alunos é " + mediaTurma.getMedia());
		
	}

}
