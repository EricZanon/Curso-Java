package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
	
	// Criar 2 interfaces funcionais para filtrar uma stream
	// criar uma interface para imprimir os filtros aplicados 
		
	Consumer<String> println = System.out::println;
	
	Predicate <Produto> desconto = p -> p.desconto >= 0.3;
	Predicate <Produto> frete = p -> p.frete == 0;
	
	Function <Produto, String> produtosFinal = p -> p.nome;
	
	Produto p1 = new Produto("notebook", 0.5 , 0);
	Produto p2 = new Produto("monitor", 0.2, 0);
	Produto p3 = new Produto("mouse", 0.3, 7);
	Produto p4 = new Produto("teclado", 0.35, 0);
	Produto p5 = new Produto("headset", 0, 2);
	Produto p6 = new Produto("ps5", 0.32, 9);
	
	List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
	
	produtos.stream()
	.filter(desconto)
	.filter(frete)
	.map(produtosFinal)
	.forEach(println);
	
	}
	
}
