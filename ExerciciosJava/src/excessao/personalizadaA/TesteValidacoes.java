package excessao.personalizadaA;

import excessao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("", 7);
			Validar.aluno(a1);
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim :)");
		
	}

}
