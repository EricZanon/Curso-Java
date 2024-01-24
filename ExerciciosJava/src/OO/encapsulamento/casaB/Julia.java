package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		
		// Julia só conseguirá acessar o atributo public
		
		// System.out.println(sogra.segredo);
		// System.out.println(sogra.facoDentroDeCasa);
		// System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}

}
