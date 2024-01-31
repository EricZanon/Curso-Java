package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		// consumer recebe um paramêtro qualquer e não retorna nada/void
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

		Produto p1 = new Produto("caneta", 12.34, 0.09);
		Produto p2 = new Produto("notebook", 2999.99, 0.15);
		Produto p3 = new Produto("caderno", 20.34, 0.19);
		Produto p4 = new Produto("borracha", 2.34, 0.30);
		Produto p5 = new Produto("lapis", 3.34, 0.12);
		
		imprimirNome.accept(p2);
		System.out.println();
		// método accept é usado para vc passar o objeto para o consumer executar a
		// função lambda

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		// a função foreach recebe um consumer como parâmetro
		produtos.forEach(imprimirNome);
		System.out.println();
		produtos.forEach(p -> System.out.println(p.preco));
		System.out.println();
		produtos.forEach(System.out::println);
		

	}
}
