package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 3000.10, 0.85);

		// usando lambda
		// se o produto com desconto tiver valor maior que 750 reais ele é caro
		// retorna true ou false

		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

		// .test avalia se o predicado é verdadeiro ou falso de acordo com os parametros passados na função lambda
		System.out.println(isCaro.test(p1));
	}

}
