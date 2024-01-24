package OO.Polimorfismo;

public class Pessoa {
	
	private double peso;
	
	public Pessoa(double peso) {
		this.peso = peso;
	}

	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void pesoAtual() {
		System.out.printf("O meu peso depois da refeição é %.2f", peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
}
