package classe;

import java.util.Date;

public class Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		UsuarioClasse u1 = new UsuarioClasse();
		u1.nome = "Giulia Padovani";
		u1.email = "giupado@gmail.com";

		UsuarioClasse u2 = new UsuarioClasse();
		u2.nome = "Giulia Padovani";
		u2.email = "giupado@gmail.com";

		// falso pois está comparando os endereços de memória
		System.out.println(u1 == u2);
		// falso pois o método equals não foi implementado
		System.out.println(u1.equals(u2));

		//System.out.println(u1 == u1);
		// agora com o equals implementado o resultado é verdadeiro
		System.out.println(u1.equals(u2));

		System.out.println(u2.equals(new Date()));
	}

}
