package OO.Composicao;

import java.util.ArrayList;

public class Compra {
	
	String nomeCliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	
	
	// método para que seja possivel adicioar itens sem precisar instancia-los, apenas passando parâmetros
	void adicionarItemInstanciado(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
		
	}
	
	// relação bidirecional 
	// desta forma no momento em que se adiciona um item à uma compra a compra também é adicionada ao item
	void adicionarItem(Item item) {
		itens.add(item);
		// atribuindo compra ao item
		item.compra = this; 
 	}
	
	void valorTotalCompra() {
		double total = 0;

		// primeiro fazer um foreach percorrendo todos os itens
		// total é igual à quantidade de itens * seu preço 
		for (Item item: itens) {
			total += item.quantidade * item.preco;
		}
		System.out.println("o valor total da compra é R$" + total);;
	}

}
