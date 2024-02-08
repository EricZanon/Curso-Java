package excessao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroInvalidoException extends RuntimeException{
	
	private String nomeDoAtributo;	

	public NumeroInvalidoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' é inválido", nomeDoAtributo);
	}

}
