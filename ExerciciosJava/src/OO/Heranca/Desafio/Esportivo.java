package OO.Heranca.Desafio;

public interface Esportivo {
	
	// por padrão, todo método dentro de uma interface é ***PÚBLICO***	e ***ABSTRATO***, ou seja, não tem corpo
	// métodos sem corpo
	// a classe que herda uma interface terá a obrigação de implementar esses métodos
	// serve pra definir que algo tem determinado método, mas vc ainda não sabe como implementar
	
	void ligarTurbo();
	void desligarTurbo();
	
	// é possível dentro de uma interface adicionar um método Default em que as subclasses não sejam obrigadas à implementar
	// usando a palavra ***DEFAULT***
	
	default boolean abrirAsa() {
		return true;
	}
}
