package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		// na construção do Supplier é passado como parâmetro () vazios pois esta interface funcional não recebe parâmetros
		// é possível fornecer uma lista, por exemplo
		Supplier< List<String> > umaLista = () -> Arrays.asList("ana", "lia", "bia", "gui");
		
		System.out.println(umaLista.get());
		
		
		
	}

}
