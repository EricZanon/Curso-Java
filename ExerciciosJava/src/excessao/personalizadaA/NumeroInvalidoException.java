package excessao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroInvalidoException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroInvalidoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O valor de '%s' é inválido", nomeDoAtributo);
	}
	
	
	
}
