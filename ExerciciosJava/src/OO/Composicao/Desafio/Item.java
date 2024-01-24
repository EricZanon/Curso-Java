package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {

	Produto produto;
	int quantidade;

	// no construtor, item recebe PRodto como um parâmetro
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	List<Produto> produtos = new ArrayList<Produto>();

	void adicionarProduto(String nome, double preco) {
		produtos.add(new Produto(nome, preco));
	}
	
	public String toString() {
		return produto.nome;
	}

}
