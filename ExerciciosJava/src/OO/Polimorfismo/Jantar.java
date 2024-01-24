package OO.Polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(75.03);
		
		Arroz ingrediente1 = new Arroz(0.250);
		Feijao ingrediente2 = new Feijao(0.100);
		Sorvete sobremesa = new Sorvete(0.100);
		
		// isso só é permitido pq a classe Comida é concreta
		// para que isso não aconteça, a classe comida tem que passar a ser abstrata
		// Comida ingrediente3 = new Comida(0.200);
		
		// ainda é permitido instanciar um objeto genérico associado à uma comida
		Comida ingrediente4 = new Arroz(0.100);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);
		// convidado.comer(ingrediente3);
		
		convidado.comer(ingrediente4);
		
		convidado.pesoAtual();
	}
}
