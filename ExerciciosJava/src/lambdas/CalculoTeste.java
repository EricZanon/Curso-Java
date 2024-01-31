package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Calculo soma = new Somar();
		Calculo multiplicacao = new Multiplicar();
		
		System.out.println(multiplicacao.executar(3, 2));
		System.out.println(soma.executar(5, 4));
	}

}
