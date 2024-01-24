package OO.Composicao.Desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Éric");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		
		compra1.adicionarItem("teclado", 500.00, 3);
		compra1.adicionarItem("notebook", 2000.00, 1);
		
		compra2.adicionarItem("Monitor", 1500.00,1);
		compra2.adicionarItem("Mouse", 300.00,1);
		
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);

		cliente.imprimirCompra(compra1);
		cliente.imprimirCompra(compra2);
		
		System.out.println(compra1.obterValorTotal());
		System.out.println(cliente.obterValorFinal());
	}

}
