package Coleções;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("ana");
		
		lista.add(u1);
		lista.add(new Usuario("carlos"));
		lista.add(new Usuario("lia"));
		lista.add(new Usuario("bia"));
		lista.add(new Usuario("manu"));
		
		// com uma lista é possivel obter um determinado elemento pelo seu indice
		// para issp de usa o método get();
		System.out.println(lista.get(3));
		
		// pode-se remover usando o indice
		System.out.println("Removido " + lista.remove(1));;
		System.out.println(lista.remove(new Usuario ("manu")));
		
		//foreach
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}	
	}
}
