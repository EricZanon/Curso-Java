package excessao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("fim..");

	}

	// excessão não checada ou não verificada
	// classe herdada de uma RuntimeException
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}

	// excessão em que há obrigatoriedade de ser tratada para compilar o programa
	// excessão checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");

	}
}