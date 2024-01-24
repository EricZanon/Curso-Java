package Lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		//exemplo de expressão lambda baseada no  método ***executar*** da interface ***Calculo***
		// quando é colocado o par de chaves de maneira xplicita, é OBRIGATORIO usar o comando return
		// é necessário associar a função criada à uma interface, no caso, **Calcular**
		Calculo somar = (x, y) -> { return x + y; };
		System.out.println(somar.executar(2, 3));
		
		// também é possível criar uma nova variavél e atribuir o resultado da operação à ela:
		Calculo multiplicar = (x, y) -> { double a = x * y; return a; };
		System.out.println(multiplicar.executar(5, 2));
		
		// também é possível fazer da maneira simplificada:
		Calculo divisao = (x, y) -> x / y;
		System.out.println(divisao.executar(6, 2));
		
		System.out.println(somar.executar(2, 3));
		
		System.out.println(somar.legal());
		
		// um método static só pode ser acessado pela nterface, e não pelas suas instancias
		System.out.println(Calculo.muitoLegal());
	}

}
