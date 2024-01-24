package ClasseDesafio;

public class Pessoa {
	
	String nome;
    double peso;
    
    public Pessoa (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    //recebe como parâmetro o objeto Comida
    void comer(Comida comida){
        this.peso = peso + comida.pesoComida;
        System.out.println("o peso depois de comer é: " + peso + " kg");
    }
    void statusAtual (){
        System.out.println("nome: " + nome + "\npeso atual: " + peso + " kg");
    }

}
