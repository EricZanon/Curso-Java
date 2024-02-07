package excessao;

import streams.Aluno;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;

		// tratamento de erro de forma genérica
		// não é tão indicado

		try {
			imprimirAluno(a1);
		} catch (Exception excessao) {
			System.out.println("Nome inválido");
		}

		// tratamento de forma especifica
		// AritmeticException
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			// printStackTrace = vai imprimir em qual ponto o erro foi gerado
			e.printStackTrace();
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}

		System.out.println("fim do programa...");

	}

	// método desprotegido pois pode ser gerado um aluno de valor nulo
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.getNome());
	}
}
