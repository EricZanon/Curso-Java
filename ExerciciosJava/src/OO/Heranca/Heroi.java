package OO.Heranca;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y) {
		super(x,y);
	}
	@Override
	public boolean atacar(Jogador oponente) {

		// distancia entre 2 jogadores
		// Math.abd retorna o valor absoluto, sem considerar se é negativo ou positivo
		int difX = Math.abs(x - oponente.x);
		int difY = Math.abs(y - oponente.y);

		if (difX == 0 && difY == 1) {
			oponente.vida -= 20;
			return true;
		} else if (difX == 1 && difY == 0) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}

	}
}
