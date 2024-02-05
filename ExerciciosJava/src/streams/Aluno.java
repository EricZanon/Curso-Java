package streams;

public class Aluno {
	
	final String nome;
	final double nota;
	final boolean bomComportamento = true;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + "]";
	}
	
}
