package classe;

public class UsuarioClasse {
	
	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {

		// se o objeto criado for uma instancia de usuário a lógica será aplicada
		// tratamento de erro para comparações entre objetos q não são instancias de
		// usuario
		if (objeto instanceof UsuarioClasse) {

			// cast convertendo objeto para Usuario(classe criada)
			UsuarioClasse outro = (UsuarioClasse) objeto;

			// variaveis que verificam se o nome/email é igual ou falso
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return this.nome.length();
	}

}
