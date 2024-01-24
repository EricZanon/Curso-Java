package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	List<Compra> compras = new ArrayList<Compra>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
		
	double obterValorFinal() {
		double valorFinal = 0;
		
		for (Compra compra: compras) {
			valorFinal += compra.obterValorTotal();
			
		}
		
		return valorFinal;
	}
	
	public String toString() {
		return nome;
	}
	
	void comprasRealizadas() {
		for (Compra c: compras) {
			int i = 0;
			i++;
			System.out.println(c);
			System.out.println(i);
		}
	}
	
	void imprimirCompra(Compra compra) {
		System.out.println(compra.itens);
	}
}
