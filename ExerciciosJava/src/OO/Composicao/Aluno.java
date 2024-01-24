package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	String nomeAluno;

	Aluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	List<Curso> cursos = new ArrayList<Curso>();

	// relacionamento bilateral
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	// cria uma nova instancia de curso e já o relaciona à um aluno
	void adicionarCursoNovo(String nomeCurso) {
		adicionarCurso(new Curso(nomeCurso));
	}

	// sempre usar **** public **** no método toString
	public String toString() {
		return nomeAluno;
	}

	// método para testar se certo aluno está matriculado em um determinado curso
	boolean estaMatriculado(Curso curso) {
		for (Curso c : cursos) {
			if (c.equals(curso)) {
				return true;
			}
		}
		return false;
	}
	
	void imprimirCursos() {
		System.out.println("O aluno está matriculado nos cursos: ");
		for (Curso curso: cursos) {
			System.out.println(curso);
		}
	}
}
