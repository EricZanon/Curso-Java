package OO.Heranca;

public class Monstro extends Jogador {
	
	// os construtores de classes filhas chamam o cnstrutor da classe pai
	// essas são as possíbilidades para se resolver o construtor padrão
	
	public Monstro() {
		super(0, 0);
	}
	
	public Monstro(int x, int y) {
		super(x, y);
	}

}
