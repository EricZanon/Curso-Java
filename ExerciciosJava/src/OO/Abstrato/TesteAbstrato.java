package OO.Abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
		
		Mamifero panqueca = new Cachorro();
		
		System.out.println(panqueca.mover());
		System.out.println(panqueca.mamar());
		System.out.println(panqueca.repirar());
		
	}

}
