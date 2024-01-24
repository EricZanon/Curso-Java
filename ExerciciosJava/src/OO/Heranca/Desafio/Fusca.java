package OO.Heranca.Desafio;

public class Fusca extends Carro {
	
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	@Override
	public void acelerar() {
		if (velocidade + 5 > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
			System.out.println("Velocidade máxima alcançada");
		} else {
			velocidade += 5;
		}
	}

}
