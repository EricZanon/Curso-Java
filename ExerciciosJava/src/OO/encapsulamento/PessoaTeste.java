package OO.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(-5);
		
		p1.setIdade(-30);
		// p1.setIdade(40);
		System.out.println(p1.getIdade());
		
		
	}

}
