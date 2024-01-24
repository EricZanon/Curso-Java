package Classe;

public class ValorNulo {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		String s1 = ""; // tem um endereço de memória mesmo que estaja "vazia"
		System.out.println(s1.concat("!!!"));

		Data d1 = null;

		if (d1 != null) {
			d1.mes = 3;
		}

		String s2 = null; // é nula, logo não aloca nenhu endereço de memória ainda. está vazia
		System.out.println(s2.concat("???"));

	}
}
