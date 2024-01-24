package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();

	// para criar o método adicionarItem, é necessário passar o produto e a
	// quantidade como parâmetros
	// neste método também já é possível instanciar um item passando seus
	// parâmetros: Nome e Preço
	// desta forma com um único método já é possível adicionar o Produto e a
	// quantidade de itens à uma compra

	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}

}