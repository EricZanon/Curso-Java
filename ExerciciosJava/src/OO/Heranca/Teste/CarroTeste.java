package OO.Heranca.Teste;

import OO.Heranca.Desafio.Carro;
import OO.Heranca.Desafio.Ferrari;
import OO.Heranca.Desafio.Fusca;

public class CarroTeste {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari(350);
		Carro fusca = new Fusca(100);

		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.velocidadeAtual();
		ferrari.acelerar();
		ferrari.velocidadeAtual();
		
		ferrari.desligarTurbo();
		ferrari.acelerar();
		ferrari.velocidadeAtual();

		fusca.acelerar();

	}

}
