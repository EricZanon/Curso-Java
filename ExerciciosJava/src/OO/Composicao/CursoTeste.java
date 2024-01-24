package OO.Composicao;

public class CursoTeste {
	
	public static void main(String[] args) {

		// cada aluno tem uma lista de cursos
		Aluno a1 = new Aluno("Éric");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		// cada curso tem uma lista de alunos
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Web");
		Curso c3 = new Curso("React");

		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);

		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);

		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);

		for (Aluno aluno : c1.alunos) {
			System.out.println(aluno);
		}

		System.out.println(a3.estaMatriculado(c1));
		System.out.println();

		c3.alunosMatriculados();
		
		a1.imprimirCursos();

	}

}
