package OO.Heranca;

public class Jogador {

	// posição do jogador no tabuleiro
	
	public String nome;
	public int vida = 100;
	public int x = 0;
	public int y = 0;
	
	protected Jogador (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {

		// distancia entre 2 jogadores
		// Math.abd retorna o valor absoluto, sem considerar se é negativo ou positivo
		int difX = Math.abs(x - oponente.x);
		int difY = Math.abs(y - oponente.y);

		if (difX == 0 && difY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (difX == 1 && difY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}

	public boolean andar(Direcao direção) {
		if (direção == Direcao.NORTE) {
			y++;
		}
		if (y >= 0 && direção == Direcao.SUL) {
			y--;
		}
		if (direção == Direcao.LESTE) {
			x++;
		}
		if (x >= 0 && direção == Direcao.OESTE) {
			x--;
		}
		return true;

	}

	public void posicao() {
		System.out.printf("A posição atual de %s é x %d e y %d\n", nome, x, y);
	}
	
	public void exibirVida() {
		System.out.printf("A vida de %s é: %d\n", nome, vida);
	}
	

}
