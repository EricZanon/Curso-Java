package OO.encapsulamento;

public class Pessoa {

	private int idade = 0;

	public Pessoa(int idade) {
		if (idade > 0) {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			System.out.println("idade inválida");
		}
	}

}
