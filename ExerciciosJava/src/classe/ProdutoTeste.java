package classe;

public class ProdutoTeste {
	
public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 1000);
        Produto p2 = new Produto("Caneta", 2.00);
        
        Produto.desconto = 0.20; // variavel de instancia
        
        double precoFinal = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        
        System.out.println(p1.nome + "\n" + p1.preco + "\n" + precoFinal);
        System.out.println(p2.nome + "\n" + p2.preco + "\n" + precoFinal2);
     }

}
