package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nomeCurso;
	boolean estaMatriculado = false;

	public Curso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	List<Aluno> alunos = new ArrayList<Aluno>();

	// relação bilateral
	// aluno é adicionado ao curso e vice-versa
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

	// cria uma nova instancia de aluno e já o relaciona à um curso
	void adicionarAlunoNovo(String nomeAluno) {
		adicionarAluno(new Aluno(nomeAluno));

	}

	// sempre usar ****public**** no método toString
	public String toString() {
		return nomeCurso;
	}

	void alunosMatriculados() {
		System.out.println("os alunos matriculados neste curso são: ");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
