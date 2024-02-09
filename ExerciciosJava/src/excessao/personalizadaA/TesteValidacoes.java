package excessao.personalizadaA;

import excessao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		/*
		 *  
		 *  Exceções personalizadas não checadas
		 *  
		 */
			
		
		try {
			
			Aluno aluno = new Aluno("a", 10);
			Validar.aluno(aluno);
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		
		} catch (NumeroInvalidoException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim");
		
		
		
	}
	
}
