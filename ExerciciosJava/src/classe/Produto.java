package classe;

public class Produto {
	
	String nome;    
    double preco;
    static double desconto = 0.25;

    public Produto() {
       
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto (){ // método não recebe parâmetro pois todas as infos já estão dentro da classe
        return preco * (1-desconto);
    }

}
