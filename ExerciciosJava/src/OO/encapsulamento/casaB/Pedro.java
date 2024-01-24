package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	// Ana mae = new Ana();

	void testeAcessos() {

		// System.out.println(mae.segredo);
		// System.out.println(mae.facoDentroDeCasa);

		// atributos recebidos por herança não podem ser acessados por uma instancia da classe herdada
		// não é necessário criar uma nova instancia de Ana para acessar seus atributos em uma classe que os herda

		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}

}
