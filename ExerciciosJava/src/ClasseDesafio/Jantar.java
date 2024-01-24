package ClasseDesafio;

public class Jantar {
	
public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("giulia", 65.0);
        Comida c1 = new Comida("Arroz", 0.220);
        Comida c2 = new Comida("Feijão", 0.240);
        
        p1.statusAtual();
        p1.comer(c1);
        p1.comer(c2);
    }

}
