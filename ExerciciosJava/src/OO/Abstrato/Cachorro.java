package OO.Abstrato;

public class Cachorro extends Mamifero {
	
	// em uma classe concreta, é obrigatório implementar os metodos abstrados herdados de uma super-classe

//	@Override
//	public String mover() {
//		return "com as patas";
//	}
	
	@Override
	public String mamar() {
		return "usando leite";
	}
}
