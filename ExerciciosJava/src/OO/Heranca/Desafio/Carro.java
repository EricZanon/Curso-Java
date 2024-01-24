package OO.Heranca.Desafio;

public class Carro {
	
	// 	valores final são declarados em MAIUSCULO	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidade;
	private int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
			System.out.println("Velocidade máxima alcançada");
		} else {
			velocidade += getDelta();
		}
	}
	
	public int frear() {
		
		if (velocidade >= 5) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}
		
		return velocidade;
	}
	
	public void velocidadeAtual() {
		System.out.println("A velocidade do veículo é: " + velocidade);
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
