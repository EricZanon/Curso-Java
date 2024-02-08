package excessao;

public class Aluno {
	
	public final String nome;
	public final double nota;
	public final boolean bomComportamento = true;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return getNome() + " tem nota " + nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bomComportamento ? 1231 : 1237);
		result = prime * result + ((getNome() == null) ? 0 : getNome().hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (bomComportamento != other.bomComportamento)
			return false;
		if (getNome() == null) {
			if (other.getNome() != null)
				return false;
		} else if (!getNome().equals(other.getNome()))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}
	
	
}
